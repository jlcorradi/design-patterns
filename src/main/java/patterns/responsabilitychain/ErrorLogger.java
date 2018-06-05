package patterns.responsabilitychain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	void writeMessage(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

}
