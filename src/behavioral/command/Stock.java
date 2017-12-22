package behavioral.command;

public class Stock {

	private String name;
	private int quantity;
	private boolean isBought = false;

	public Stock(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void buy() {
		isBought = true;
		System.out.println("Stock [ Name: " + getName() + ", Quantity: " + getQuantity() + " ] bought");
	}

	public void sell() {
		if (isBought) {
			System.out.println("Stock [ Name: " + getName() + ",Quantity: " + getQuantity() + " ] sold");
			isBought = false;
		} else {
			System.out.println("This stock not bought");
		}
	}
}
