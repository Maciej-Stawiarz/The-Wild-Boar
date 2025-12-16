package ms.TheWildBoar.app.cucumber.configs;

import ms.TheWildBoar.app.model.config.UnitTemplateEntry;
import ms.TheWildBoar.app.model.unit.UnitTemplate;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class UnitTemplateLoader {
	
	private static boolean templatesLoaded = false;
	
	public static void loadTemplates() throws Exception {
		if (templatesLoaded) {
			return;
		}
		
		String rootPackage = "ms.TheWildBoar.app.model.unit";
		
		ClassPathScanningCandidateComponentProvider scanner =
				new ClassPathScanningCandidateComponentProvider(false);
		
		scanner.addIncludeFilter(new AssignableTypeFilter(Object.class));
		
		for (BeanDefinition beanDefinition : scanner.findCandidateComponents(rootPackage)) {
			Class<?> clazz = Class.forName(beanDefinition.getBeanClassName());
			for (Class<?> nested : clazz.getDeclaredClasses()) {
				registerStaticTemplates(nested);
			}
			registerStaticTemplates(clazz);
		}
		
		templatesLoaded = true;
	}
	
	private static void registerStaticTemplates(Class<?> clazz) throws Exception {
		for (Field field : clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent(UnitTemplateEntry.class) &&
					Modifier.isStatic(field.getModifiers()) &&
					UnitTemplate.class.isAssignableFrom(field.getType())) {
				
				UnitTemplate template = (UnitTemplate) field.get(null);
				String key = field.getName();
				UnitTemplateRegistry.register(key, template);
			}
		}
	}
}