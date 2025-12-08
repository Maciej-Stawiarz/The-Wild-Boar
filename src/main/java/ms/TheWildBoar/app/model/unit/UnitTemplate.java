package ms.TheWildBoar.app.model.unit;

import java.util.List;

import ms.TheWildBoar.app.model.skill.Skill;

public record UnitTemplate(String name,
						   Race race,
						   Integer maxHealth,
						   Integer defense,
						   Integer minDamage,
						   Integer maxDamage,
						   List<Skill> skills) {
	
}