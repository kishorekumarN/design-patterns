package behavioral.chainofresponsibility;

public abstract class Logger {
	public static int DEBUG = 1;
	public static int INFO = 2;
	public static int ERROR = 3;
	
	
	protected int level;
	
	/**
	 * Next element in chain of responsibility.
	 */
	private Logger nextLogger;


	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	public Logger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	protected abstract void write(String message);
}
