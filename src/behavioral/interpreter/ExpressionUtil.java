package behavioral.interpreter;

public class ExpressionUtil {

	public static Boolean isOperator(String input) {
		if ("+".equals(input) || "-".equals(input) || "*".equals(input)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public static Expression getOperator(String opType, Expression left, Expression right) {
		switch (opType) {
		case "+":
			return new Add(left, right);
		case "-":
			return new Substract(left, right);
		case "*":
			return new Product(left, right);

		default:
			return null;
		}
	}
}
