package ms.TheWildBoar.app.model.unit.undead;

import ms.TheWildBoar.app.model.config.UnitTemplateEntry;
import ms.TheWildBoar.app.model.unit.Race;
import ms.TheWildBoar.app.model.unit.UnitTemplate;

import java.util.ArrayList;

public final class Undead {
	
	public static final class Skeleton {
		
		@UnitTemplateEntry
		public static final UnitTemplate FragileSkeleton = new UnitTemplate(
				"Fragile skeleton",
				Race.UNDEAD,
				20,
				0,
				3,
				5,
				new ArrayList<>()
		);
		
		@UnitTemplateEntry
		public static final UnitTemplate WeakSkeleton = new UnitTemplate(
				"Weak skeleton",
				Race.UNDEAD,
				40,
				2,
				6,
				10,
				new ArrayList<>()
		);
		
		/**
		 * ---------- BASE ----------
		 * Default base for the skeleton units. All further balancing should stem from this specific unit.
		 */
		@UnitTemplateEntry
		public static final UnitTemplate Skeleton = new UnitTemplate(
				"Skeleton",
				Race.UNDEAD,
				60,
				5,
				12,
				16,
				new ArrayList<>()
		);
		
		@UnitTemplateEntry
		public static final UnitTemplate StrongSkeleton = new UnitTemplate(
				"Strong skeleton",
				Race.UNDEAD,
				80,
				7,
				15,
				20,
				new ArrayList<>()
		);
		
		@UnitTemplateEntry
		public static final UnitTemplate DangerousSkeleton = new UnitTemplate(
				"Dangerous skeleton",
				Race.UNDEAD,
				100,
				10,
				20,
				27,
				new ArrayList<>()
		);
	}
	
	public static final class Zombie {
		
		/**
		 * ---------- BASE ----------
		 * Default base for the zombie units. All further balancing should stem from this specific unit.
		 */
		@UnitTemplateEntry
		public static final UnitTemplate Zombie = new UnitTemplate(
				"Zombie",
				Race.UNDEAD,
				120,
				10,
				20,
				30,
				new ArrayList<>()
		);
	}
	
	public static final class Lich {
		
		/**
		 * ---------- BASE ----------
		 * Default base for the lich units. All further balancing should stem from this specific unit.
		 */
		@UnitTemplateEntry
		public static final UnitTemplate Lich = new UnitTemplate(
				"Lich",
				Race.UNDEAD,
				200,
				10,
				50,
				100,
				new ArrayList<>()
		);
	}
}