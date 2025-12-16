package ms.TheWildBoar.app.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ms.TheWildBoar.app.model.unit.BaseUnit;
import ms.TheWildBoar.app.model.unit.UnitFactory;
import ms.TheWildBoar.app.model.unit.UnitTemplate;

import static org.assertj.core.api.Assertions.assertThat;


public class UnitSteps {
	private UnitTemplate unitTemplate;
	private BaseUnit baseUnit;
	
	@Given("UnitTemplate was provided to the process: {template}")
	public void templateWasProvidedToTheProcess(UnitTemplate unitTemplate) {
		assertThat(unitTemplate).isNotNull();
		this.unitTemplate = unitTemplate;
	}
	
	@When("the value is provided to the UnitFactory")
	public void theValueIsProvidedToTheUnitFactory() {
		this.baseUnit = UnitFactory.create(unitTemplate);
	}
	
	@Then("Base unit should be created")
	public void baseUnitShouldBeCreated() {
		assertThat(baseUnit)
				.isNotNull()
				.hasFieldOrProperty("id")
				.hasFieldOrProperty("name")
				.hasFieldOrProperty("race")
				.hasFieldOrProperty("maxHealth")
				.hasFieldOrProperty("currentHealth")
				.hasFieldOrProperty("defense")
				.hasFieldOrProperty("maxDamage")
				.hasFieldOrProperty("minDamage")
				.hasFieldOrProperty("skills")
				.hasAllNullFieldsOrPropertiesExcept("id",
													"name",
													"race",
													"maxHealth",
													"currentHealth",
													"defense",
													"maxDamage",
													"minDamage",
													"skills");
	}
	
	@And("it's values match those of the template")
	public void itSValuesMatchThoseOfTheTemplate() {
		assertThat(baseUnit)
				.hasFieldOrPropertyWithValue("id", null)
				.hasFieldOrPropertyWithValue("name", unitTemplate.name())
				.hasFieldOrPropertyWithValue("race", unitTemplate.race())
				.hasFieldOrPropertyWithValue("maxHealth", unitTemplate.maxHealth())
				.hasFieldOrPropertyWithValue("currentHealth", unitTemplate.maxHealth())
				.hasFieldOrPropertyWithValue("defense", unitTemplate.defense())
				.hasFieldOrPropertyWithValue("maxDamage", unitTemplate.maxDamage())
				.hasFieldOrPropertyWithValue("minDamage", unitTemplate.minDamage())
				.hasFieldOrPropertyWithValue("skills", unitTemplate.skills());
	}
}
