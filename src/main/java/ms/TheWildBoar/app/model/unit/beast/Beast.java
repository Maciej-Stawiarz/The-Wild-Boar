package ms.TheWildBoar.app.model.unit.beast;

import ms.TheWildBoar.app.model.config.UnitTemplateEntry;
import ms.TheWildBoar.app.model.unit.Race;
import ms.TheWildBoar.app.model.unit.UnitTemplate;

import java.util.ArrayList;

public final class Beast {
	
	public static final class DomesticatedAnimal {
		
		@UnitTemplateEntry
		public static final UnitTemplate WhiteRabbit = new UnitTemplate(
				"White rabbit",
				Race.BEAST,
				10,
				0,
				1,
				2,
				new ArrayList<>()
		);
		
		@UnitTemplateEntry
		public static final UnitTemplate Cow = new UnitTemplate(
				"Cow",
				Race.BEAST,
				50,
				1,
				3,
				6,
				new ArrayList<>()
		);
	}
	
	public static final class WildAnimal {
		
		@UnitTemplateEntry
		public static final UnitTemplate Wolf = new UnitTemplate(
				"Wolf",
				Race.BEAST,
				50,
				1,
				3,
				6,
				new ArrayList<>()
		);
	}
}
