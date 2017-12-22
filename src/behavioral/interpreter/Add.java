package behavioral.interpreter;

public class Add implements Expression {

	private Expression leftExpression;
	private Expression rightExpression;

	public Add(Expression left, Expression right) {
		this.leftExpression = left;
		this.rightExpression = right;
	}

	@Override
	public Integer interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}

}
