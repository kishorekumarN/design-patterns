package creational.singleton;

public class ProductionHouse {
private static ProductionHouse houseObj = null;
	
	private ProductionHouse(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static ProductionHouse getInstance() {
		if (houseObj == null) {
			houseObj = new ProductionHouse();
		}
		
		return houseObj;
	}
}
