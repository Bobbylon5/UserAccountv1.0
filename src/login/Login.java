package login;

/**
 * Two exception imports
 * One validation import from validation package
 */
import validation.IncorrectPasswordException;
import validation.UserNotFoundException;
import validation.Validation;

/**
 * This is a simple login class that currently has the ability to store a validator object.
 * It's only function is to call the validator passing in a user name and password.
 * @author robert.harkess
 *
 */
public class Login implements  UserInterface {

	/** 
	 * A private class of Validation called validate to be used later
	 */
	private Validation validate;



	/**
	 * Empty base constructor
	 */
	public Login(){
	}
	
	
	
	/**
	 * An overloaded constructor that takes two arguments (user name and password).
	 * It sets up the Validator and runs it passing in both the user name and password.
	 * @param userName the String 'user name' passed in will be passed out again.
	 * @param password the String 'Password' handed in is passed out again.
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public Login(String userName, String password) throws UserNotFoundException, IncorrectPasswordException{
		validate = new Validation();
		validate.setUserNameAndPassword(userName, password);
		validate.run();
	}

	
	@Override
	public boolean login(String userName, String password) throws UserNotFoundException, IncorrectPasswordException {
		validate = new Validation();
		validate.setUserNameAndPassword(userName, password);
		validate.run();
		return false;
	}
	
}