package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
	

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		shapeDecorator.draw();
		setRed(shapeDecorator);
	}

	private void setRed(Shape shapeDecorator) {
		System.out.println("Coloring shape");
		
	}

}
