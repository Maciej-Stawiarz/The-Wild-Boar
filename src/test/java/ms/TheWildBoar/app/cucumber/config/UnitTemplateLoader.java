package ms.TheWildBoar.app.cucumber.config;

import jakarta.annotation.PostConstruct;
import ms.TheWildBoar.app.model.config.UnitTemplateEntry;
import ms.TheWildBoar.app.model.unit.UnitTemplate;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@Component
public class UnitTemplateLoader {
	
	@PostConstruct
	public void loadTemplatesOnStartup() throws Exception {
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
	}
	
	
	private void registerStaticTemplates(Class<?> clazz) throws Exception {
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
