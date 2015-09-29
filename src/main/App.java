package main;

/**
 * Two exceptions imported
 */
import validation.IncorrectPasswordException;
import validation.UserNotFoundException;


/**
 * Simple 'main' (entry) app class.
 * @author robert.harkess
 *
 */
public class App {

	/**
	 * The static main method.
	 * Creates a consoleApp class and runs the login method throwing exceptions and catching an exception is the password is incorrect
	 * @param args
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public static void main(String[] args) throws UserNotFoundException, IncorrectPasswordException {
		// 

		/**
		 *The console runner.
		 */
		ConsoleApp test2 = new ConsoleApp();
		try {
			test2.login();
		} catch (NoConsoleException ex) {
			System.out.println(""+ ex.toString());
		}
		
		
		
		/**
		 * For use with testing
		 * must be commented out or deleted for live version
		 */
		test2.login2();
	
	}


}
