package behavioral.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock stockOne = new Stock("one", 10);
		Stock stockTwo = new Stock("two", 20);
		Stock stockThree = new Stock("three", 30);
		
		Broker broker = new Broker();
		broker.takeOrder(new BuyStock(stockOne));
		broker.takeOrder(new BuyStock(stockTwo));
		broker.takeOrder(new SellStock(stockOne));
		broker.takeOrder(new SellStock(stockThree));
		
		
		broker.placeOrder();
	}
}
