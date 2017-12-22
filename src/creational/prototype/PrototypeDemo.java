package creational.prototype;

public class PrototypeDemo {
	public static void main(String[] args) {

		Employee prototype = new Employee(1, "Tester", "Blre", "123456");
		System.out.println("Original : " + prototype);
		
		Employee clone = (Employee) prototype.clone();
		
		System.out.println("Clone : " + clone);
		
		prototype.setId(2);
		
		System.out.println("Original after modify : " + prototype);
		
		System.out.println("Clone after modify : " + clone);
	}
}
