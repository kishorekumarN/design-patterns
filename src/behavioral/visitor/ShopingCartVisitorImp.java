package behavioral.visitor;

public class ShopingCartVisitorImp implements ShopingCartVisitor {

	@Override
	public int visit(Book book) {

		int cost = 0;
		if (book.getPrice() > 50) {
			//If book price more then 50 apply discount. 
			cost = book.getPrice() -5;
		} else {
			cost =  book.getPrice();
		}
		
		System.out.println("Cost of book-" + book.getIsbn() + " = " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPrice() * fruit.getWeight(); 
		System.out.println("Cost of " +fruit.getName()+ ", " +fruit.getWeight() + "Kg = " + cost);
		return cost;
	}
}
