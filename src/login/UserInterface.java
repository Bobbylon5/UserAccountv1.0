package login;

/**
 * Two exception imports *
 */
import validation.IncorrectPasswordException;
import validation.UserNotFoundException;

/**
 * The Interface class called UserInterface
 * @author robert.harkess
 *
 */
public interface UserInterface {

	/**
	 * The only accessible method to the outside world for the Login class
	 * @param userName - Simple String username
	 * @param password - Simple String password
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	boolean login(String userName, String password) throws UserNotFoundException, IncorrectPasswordException;

}