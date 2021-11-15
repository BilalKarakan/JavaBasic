package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger logger = new EmailLogger();
		 * logger.log("The Log Message:");
		 * DatabaseLogger logger2 = new DatabaseLogger();
		 * logger2.log("The Log message:");
		 */
		
		
		  BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
		  for (BaseLogger logger : loggers){
		  		logger.log("The Log Message");
		  }
		  
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}
}
