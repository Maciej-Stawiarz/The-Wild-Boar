package ms.TheWildBoar.app.model.effect;

import ms.TheWildBoar.app.model.unit.Unit;

public abstract class Effect {
  abstract void apply(Unit source, Unit target);
}
