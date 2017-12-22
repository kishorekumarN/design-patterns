package creational.singleton;

/**
 * scope of the synchronized block is reduced to affect only the first access
 *
 */
public class ProductionHouseDoubleCheck {

	private static ProductionHouseDoubleCheck doubleCheckObj = null;

	private ProductionHouseDoubleCheck(){}
	
	public static ProductionHouseDoubleCheck getInstance() {
		if (doubleCheckObj == null) {
			synchronized (ProductionHouseDoubleCheck.class) {
				if (doubleCheckObj == null) {
					doubleCheckObj = new ProductionHouseDoubleCheck();
				}
			}
		}
		return doubleCheckObj;
	}
}
