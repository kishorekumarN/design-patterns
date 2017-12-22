package creational.prototype;

public class Employee implements Prototype {
	
	private int id;
	private String name;
	private String address;
	private String number;
	
	public Employee(int id, String name, String address, String number) {
		this();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public Employee() {
	}

	@Override
	public Prototype clone(){
		return new Employee(id, name, address, number);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	}
}

