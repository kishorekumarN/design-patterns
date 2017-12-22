package structural.decorator;

public abstract class ShapeDecorator implements Shape {
	
	protected Shape shapeDecorator;
	
	public ShapeDecorator(Shape shape) {
		this.shapeDecorator = shape;
	}

	@Override
	public void draw() {
		shapeDecorator.draw();
	}

}
