package behavioral.chainofresponsibility;

public class ChainOfRespDemo {

	private static Logger getLogger() {
		
		Logger errorLoger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.INFO);
		Logger consoleLogger = new ConsoleLogger(Logger.DEBUG);
		
		errorLoger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLoger;
	}
	
	public static void main(String[] args) {
		
		Logger logger = getLogger();
		
		logger.logMessage(Logger.DEBUG, "Log DEBUG message");

		logger.logMessage(Logger.INFO, "Log INFO message");
		
		logger.logMessage(Logger.ERROR, "Log ERROR message");
	}
}
