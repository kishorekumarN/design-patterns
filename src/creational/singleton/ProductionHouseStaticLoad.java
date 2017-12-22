package creational.singleton;

public class ProductionHouseStaticLoad {
	
	/**
	 * Eager Singleton, on class loading single instance is created and stored in static variable.
	 * 
	 *  disadvantage: instantiation of an object earlier than its first use might not be a recommended approach.
	 */
	private static ProductionHouseStaticLoad INSTANCE = new ProductionHouseStaticLoad();
	
	private ProductionHouseStaticLoad(){
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ProductionHouseStaticLoad getInstance() {
		return INSTANCE;
	}

}
