package ms.TheWildBoar.app.model.unit;

import ms.TheWildBoar.app.model.generic_model.DamageEvent;

public class BaseUnit extends Unit {
	
	public BaseUnit(UnitTemplate unitTemplate) {
		super(unitTemplate);
	}
	
	@Override
	DamageEvent generateDamage() {
		return null;
	}
	
	@Override
	void applyDamage(DamageEvent damageEvent) {
	
	}
}
