package structural.decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		
		Shape recShape = new Rectangle();
		Shape circle = new Circle();
		
		RedShapeDecorator decoratorRec = new RedShapeDecorator(recShape);
		
		circle.draw();
		decoratorRec.draw();
	}

}
