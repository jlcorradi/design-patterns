package patterns.state;

public class ConsoleUI {

	public static void main(String[] args) {
		Context ctx = new Context();
		StartState startState = new StartState();
		startState.doAction(ctx);

		System.out.println(ctx.getState());

		StopState stopState = new StopState();
		stopState.doAction(ctx);

		System.out.println(ctx.getState());
	}

}
