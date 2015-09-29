package main;

/**
 * import of the console
 * import of the login class
 * import of the user interface class
 * import of the validation exceptions
 */
import java.io.Console;
import login.Login;
import login.UserInterface;
import validation.IncorrectPasswordException;
import validation.UserNotFoundException;



/**
 * This class is defined to create a console entry point,
 * also creates a basic test method to try out some of the features
 * @author robert.harkess
 *
 */
public class ConsoleApp  {

	/**
	 * Creates a new login attached to a user interface
	 */
	private static final UserInterface USER_INTERFACE = new Login();

	/**
	 * The console login, calls the console and asks for both a user name and password.
	 * @throws NoConsoleException
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void login() throws NoConsoleException, UserNotFoundException, IncorrectPasswordException{
		
		try {
		Console console = System.console();
		if (console == null){
			throw new NoConsoleException(); 
		}
		console.printf("Please enter your user name: ");
		String username = console.readLine();
		console.printf(username + " Please enter your password: ");
		String password = console.readLine();
		// char[] password = console.readPassword();

		if (USER_INTERFACE.login(username, password)) {
			System.out.println("Hello: " + username);

		} else {
			System.out.println("Sorry your username/password is incorrect.");
		}
		}catch (NullPointerException ex) {
			System.out.println("Console is not available!");
		}
	}

	/**
	 * Will be deleted for final login!
	 * The TEST login 
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void login2() throws UserNotFoundException, IncorrectPasswordException {

		try {
		UserInterface att0 = new Login("Bobby", "ejit");
		Login att1 = new Login("Bobby", "ejit");
		
		}catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		}catch (IncorrectPasswordException ex) {
			System.out.println("Invalid Password! " + ex.attempts() + " tries.");
		}
		
		try {
			UserInterface att2 = new Login("Bobby", "Horrible");
			Login att3 = new Login("Bobby", "Horrible");

			}catch (UserNotFoundException ex) {
				System.out.println("User not Found: " + ex);
			}catch (IncorrectPasswordException ex) {
				System.out.println("Invalid Password! " + ex.attempts() + " tries.");
			}
		
		try {
			UserInterface att4 = new Login("Bobby", "password");
			Login att5 = new Login("Bobby", "password");
			}catch (UserNotFoundException ex) {
				System.out.println("User not Found: " + ex);
			}catch (IncorrectPasswordException ex) {
				System.out.println("Invalid Password! " + ex.attempts() + " tries.");
			}
		
		try {
			UserInterface att6 = new Login("Stuart", "password");
			Login att7 = new Login("Billy", "password");
			}catch (UserNotFoundException ex) {
				System.out.println("User not Found: " + ex);
			}catch (IncorrectPasswordException ex) {
				System.out.println("Invalid Password! " + ex.attempts() + " tries.");
			}


	}

}
