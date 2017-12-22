package behavioral.interpreter;

public class Product implements Expression {
	private Expression leftExpression;
	private Expression rightExpression;

	public Product(Expression left, Expression right) {
		this.leftExpression = left;
		this.rightExpression = right;
	}

	@Override
	public Integer interpret() {
		return leftExpression.interpret() * rightExpression.interpret();
	}

}
