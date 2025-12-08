package ms.TheWildBoar.app.cucumber.type;

import io.cucumber.java.ParameterType;
import ms.TheWildBoar.app.model.unit.UnitTemplate;
import ms.TheWildBoar.app.cucumber.config.UnitTemplateRegistry;

public class TemplateType {
	
	@ParameterType(".*")
	public UnitTemplate template(String key) {
		return UnitTemplateRegistry.get(key);
	}
}
