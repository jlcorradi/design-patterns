package patterns.responsabilitychain;

public class ConsoleUi {

	public static AbstractLogger getLoggerChain() {

		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		FileLogger fileLogger = new FileLogger(AbstractLogger.INFO);
		ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger logger = getLoggerChain();

		logger.logMessage(AbstractLogger.INFO, "This is an infomation");
		logger.logMessage(AbstractLogger.DEBUG, "This is a debug level message");
		logger.logMessage(AbstractLogger.ERROR, "This is an error information");
	}

}
