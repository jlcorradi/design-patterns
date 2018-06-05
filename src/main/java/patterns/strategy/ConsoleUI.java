package patterns.strategy;

public class ConsoleUI {

	public static void main(String[] args){
		int num1 = 7;
		int num2 = 9;
		Context context = new Context(new OperationAdd());
		System.out.println("7 + 9: " + context.executeStrategy(num1, num2));
		context = new Context(new OperationSubtract());
		System.out.println("7 - 9: " + context.executeStrategy(num1, num2));
		context = new Context(new OperationMultiply());
		System.out.println("7 * 9: " + context.executeStrategy(num1, num2));
	}
	
}
