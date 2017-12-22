package behavioral.visitor;

import java.util.ArrayList;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		ArrayList<ItemElement> items = new ArrayList<>();
		items.add(new Book(10, "ISBN1234"));
		items.add(new Fruit(20, "Mango", 2));
		items.add(new Fruit(70, "banana", 3));
		
		calculateTotal(items);
	}

	private static void calculateTotal(ArrayList<ItemElement> items) {
		int total = 0;
		
		for (ItemElement item : items) {
			total = total +item.accept(new ShopingCartVisitorImp());
		}
		System.out.println("Shoping card total : " + total);
	}
}
