package patterns.responsabilitychain;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	void writeMessage(String message) {
		System.out.println("Standard Console::Logger: " + message);

	}

}
