package ms.TheWildBoar.app.model.unit;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ms.TheWildBoar.app.model.generic_model.DamageEvent;
import ms.TheWildBoar.app.model.skill.Skill;

@Getter
@Setter
public abstract class Unit {
	
	private Long id;
	private String name;
	private Race race;
	private Integer maxHealth;
	private Integer currentHealth;
	private Integer defense;
	private Integer maxDamage;
	private Integer minDamage;
	private List<Skill> skills;
	
	public Unit(UnitTemplate unitTemplate) {
		this.name = unitTemplate.name();
		this.race = unitTemplate.race();
		this.maxHealth = unitTemplate.maxHealth();
		this.currentHealth = this.maxHealth;
		this.defense = unitTemplate.defense();
		this.maxDamage = unitTemplate.maxDamage();
		this.minDamage = unitTemplate.minDamage();
		this.skills = unitTemplate.skills();
	}
	
	abstract DamageEvent generateDamage();
	
	abstract void applyDamage(DamageEvent damageEvent);
}