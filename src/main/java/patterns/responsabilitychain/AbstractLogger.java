package patterns.responsabilitychain;

public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * Do your job if it is your responsibility and then pass it on to the next...
	 * 
	 * @param level
	 * @param message
	 */
	public void logMessage(int level, String message) {
		if (this.level <= level) {
			writeMessage(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract void writeMessage(String message);

}
