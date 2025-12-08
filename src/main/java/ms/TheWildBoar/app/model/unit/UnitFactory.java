package ms.TheWildBoar.app.model.unit;

public class UnitFactory {
	
	public static BaseUnit create(UnitTemplate unitTemplate) {
		return new BaseUnit(unitTemplate);
	}
}