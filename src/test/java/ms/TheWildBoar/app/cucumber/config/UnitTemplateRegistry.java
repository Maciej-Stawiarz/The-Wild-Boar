package ms.TheWildBoar.app.cucumber.config;

import ms.TheWildBoar.app.model.unit.UnitTemplate;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public final class UnitTemplateRegistry {
	
	public static final Map<String, UnitTemplate> unitTemplateRegistry = new HashMap<>();
	
	public static UnitTemplate get(String key) {
		return Optional.ofNullable(unitTemplateRegistry.get(key))
				.orElseThrow(() -> new IllegalArgumentException("Template %s not found within the registry".formatted(key)));
	}
	
	public static void register(String key, UnitTemplate template) {
		unitTemplateRegistry.put(key, template);
	}
	
	public static Map<String, UnitTemplate> getAll() {
		return Collections.unmodifiableMap(unitTemplateRegistry);
	}
}