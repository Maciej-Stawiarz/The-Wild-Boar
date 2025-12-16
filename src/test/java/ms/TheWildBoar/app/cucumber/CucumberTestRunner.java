package ms.TheWildBoar.app.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"ms.TheWildBoar.app.cucumber"},
		plugin = {"pretty"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}