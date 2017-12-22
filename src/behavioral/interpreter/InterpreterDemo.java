package behavioral.interpreter;

import java.util.Stack;

public class InterpreterDemo {

	public static void main(String[] args) {
		//used a postfix expression to solve it.
		String interpretString = "7 3 - 2 1 + *";
		Stack<Expression> stack = new Stack<>();

		String[] toArray = interpretString.split(" ");
		for (String string : toArray) {
			if (ExpressionUtil.isOperator(string)) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression operator = ExpressionUtil.getOperator(string, left, right);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				Expression i = new Number(Integer.parseInt(string));
				stack.push(i);
			}
		}
		System.out.println("( "+interpretString+" ): "+stack.pop().interpret());
	}
}


