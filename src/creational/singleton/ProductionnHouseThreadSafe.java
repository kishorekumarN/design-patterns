package creational.singleton;


/**
 * This approach is to instantiate the object at the first access time and also to make it thread-safe.
 * Disadvantage: This method is poorer performance, as the method is synchronized.
 */
public class ProductionnHouseThreadSafe {

	private static ProductionnHouseThreadSafe threadSafeObj = null;
	
	private ProductionnHouseThreadSafe(){}
	
	public static synchronized ProductionnHouseThreadSafe getInstance() {
		if (threadSafeObj == null) {
			threadSafeObj = new ProductionnHouseThreadSafe();
		}
		
		return threadSafeObj;
	}
}
