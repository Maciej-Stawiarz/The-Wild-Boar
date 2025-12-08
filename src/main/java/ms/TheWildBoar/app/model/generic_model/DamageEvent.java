package ms.TheWildBoar.app.model.generic_model;

import java.util.List;
import ms.TheWildBoar.app.model.effect.Effect;
import ms.TheWildBoar.app.model.unit.Unit;

public record DamageEvent(
    Unit attacker,
    long damageAmount,
    List<Effect> effects) {

}