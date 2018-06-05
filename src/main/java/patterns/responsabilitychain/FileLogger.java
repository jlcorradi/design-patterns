package patterns.responsabilitychain;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	void writeMessage(String message) {
		System.out.println("File::Logger: " + message);
	}

}
