package ms.TheWildBoar;

import ms.TheWildBoar.app.model.unit.BaseUnit;
import ms.TheWildBoar.app.model.unit.UnitFactory;
import ms.TheWildBoar.app.model.unit.undead.Undead;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheWildBoarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWildBoarApplication.class, args);
		BaseUnit baseUnit = UnitFactory.create(Undead.Skeleton.FragileSkeleton);
	}
}