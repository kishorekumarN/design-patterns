package creational.singleton;

public class SingletonDemo extends Thread{

	@Override
	public void run() {
		ProductionHouse house = ProductionHouse.getInstance();
		System.out.println(house.toString());
	}
	
	public static void main(String[] args) {
		SingletonDemo houseTest = new SingletonDemo();
		houseTest.start();
		
		SingletonDemo houseTest2 = new SingletonDemo();
		houseTest2.start();
		
		SingletonDemo houseTest3 = new SingletonDemo();
		houseTest3.start();
		
		SingletonDemo houseTest4 = new SingletonDemo();
		houseTest4.start();
		
		SingletonDemo houseTest5 = new SingletonDemo();
		houseTest5.start();
	}
}

