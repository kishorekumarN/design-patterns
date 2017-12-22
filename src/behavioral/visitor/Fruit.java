package behavioral.visitor;

public class Fruit implements ItemElement {
	
	private int price;
	private String name;
	private int weight;
	
	public Fruit(int price, String name, int weight) {
		super();
		this.price = price;
		this.name = name;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int accept(ShopingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
