package patterns.strategy;

/**
 * Executes an operation depending on the strategy.
 * 
 * Strategies are implemented, following a certain strategy, all implementing a certain interface.
 * 
 * @author Jorge Corradi
 */
public class Context {

	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}

}
