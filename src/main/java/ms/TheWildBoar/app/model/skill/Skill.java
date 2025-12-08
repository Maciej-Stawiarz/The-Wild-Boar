package ms.TheWildBoar.app.model.skill;

import ms.TheWildBoar.app.model.effect.Effect;

public abstract class Skill {

  private Long id;
  private String name;
  private Long cost;
  private Long cooldown;
  private Effect effect;

  abstract void use();
}