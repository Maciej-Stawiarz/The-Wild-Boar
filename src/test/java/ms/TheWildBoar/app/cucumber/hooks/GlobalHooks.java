package ms.TheWildBoar.app.cucumber.hooks;

import io.cucumber.java.BeforeAll;
import ms.TheWildBoar.app.cucumber.configs.UnitTemplateLoader;

public class GlobalHooks {
	
	@BeforeAll
	public static void initializeTemplates() throws Exception {
		UnitTemplateLoader.loadTemplates();
	}
}
