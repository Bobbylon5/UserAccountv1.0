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
import user.UserNotFoundException;
import validation.IncorrectPasswordException;

/**
 * This class is defined to create a console entry point, also creates a basic
 * test method to try out some of the features
 * 
 * @author robert.harkess
 *
 */
public class ConsoleApp {

	/**
	 * Creates a new login attached to a user interface
	 */
	private static final UserInterface USER_INTERFACE = new Login();

	/**
	 * The console login, calls the console and asks for both a user name and
	 * password.
	 * 
	 * @throws NoConsoleException
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void login() throws NoConsoleException, UserNotFoundException, IncorrectPasswordException {

		try {
			Console console = System.console();
			if (console == null) {
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
		} catch (NullPointerException ex) {
			System.out.println("Console is not available!");
		}
	}

	/**
	 * Will be deleted for final login! A series of test inputs The TEST login
	 * 
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void login2() throws UserNotFoundException, IncorrectPasswordException {

		try {
			UserInterface att0 = new Login("Bobby", "ejit"); // fail as Bobby is not a user name
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		}

		try {
			Login att1 = new Login("userName1", "ejit"); // fail with an invalid password
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		}

		try {
			UserInterface att2 = new Login("Bobby", "Horrible"); // fail as bobby is  a name not a  user name
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}

		try {
			Login att3 = new Login("userName", "Horrible"); // fail as invalid  password
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}
		try {
			Login att4 = new Login("userName", "Horrible"); // fail as invalid password *2
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}
		try {
			Login att5 = new Login("userName", "Horrible"); // fail as invalidm password *3
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}
		try {
			Login att6 = new Login("userName", "Horrible"); // fail as invalid password *4
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}

		try {
			UserInterface att7 = new Login("userName", "hill"); // fail
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}
		try {
			UserInterface att8 = new Login("userName", "password"); // pass
		} catch (UserNotFoundException ex) {
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey) {
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}

		try{
			UserInterface att9 = new Login("userName", "hill"); // pass
		} catch (UserNotFoundException ex){
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey){
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}

		try{
			Login att10 = new Login("Bobby", "password"); // fail bobby is a name not username
		} catch (UserNotFoundException ex){
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey){
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}
		try{
			UserInterface att11 = new Login("Stuart", "password"); // pass
			Login att12 = new Login("Billy", "password"); // fail as Billy is a name not username
		} catch (UserNotFoundException ex){
			System.out.println("User not Found: " + ex);
		} catch (IncorrectPasswordException ey){
			System.out.println("Invalid Password! " + ey.attempts() + " tries.");
		}

	}

}
