package validation;

import user.UserAccount;
import user.UserNotFoundException;
import user.Userlookup;
import user.UserlookupInterface;
import static org.mockito.Mockito.*;


public class Validation {

	/**
	 * Creates a new login attached to a user interface
	 */
	private static final UserlookupInterface USER_LOOKUP = new Userlookup();
	/**
	 * A variable that is of type UserAccount called user
	 */
	private UserAccount user;
	/**
	 * A variable that is of type string called password
	 */
	private String password;
	/**
	 * A variable that is of type String called user name
	 */
	private String userName;
	/**
	 * A variable that is of type int called switchI
	 */
	private int switchI;
	
	
	/**
	 * Empty Base Constructor
	 */
	public Validation() {
	}
	
	/**
	 * Main constructor for the validation class requires a user namer and password and automatically performs the checks by calling the run method
	 * @param password
	 * @param userName
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public Validation(String password, String userName) throws UserNotFoundException, IncorrectPasswordException {
		this.password = password;
		this.userName = userName;
		run();
	}
	

	/**
	 * A method called run 
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void run() throws UserNotFoundException, IncorrectPasswordException{
		userlookupInplimentation();
		check();		
	}

	/**
	 * A method to swap the database use
	 * currently 
	 * 0 = hashmap
	 * anything else = object[]
	 * @param i = int
	 */
	public void swapUserlookupInplimentation(int i){
		switchI = i;
	}
	
	/**
	 * A method to define which database to use
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void userlookupInplimentation() throws UserNotFoundException, IncorrectPasswordException{
		if (switchI == 0){
			user = getUserFromHash();
		}else {
			user = getUserFromArray();
		}
	}
	
	/**
	 * A method that is the Getter of userFromArray
	 * @throws UserNotFoundException 
	 * @return user = UserAccount
	 */
	private UserAccount getUserFromArray() throws UserNotFoundException {
		user = USER_LOOKUP.getUserAccountFromArray(userName);
	 	return user; 
	}
	
	/**
	 * A method that is the Getter of userFromHash
	 * @throws UserNotFoundException 
	 * @return user = UserAccount
	 */
	private UserAccount getUserFromHash() throws UserNotFoundException {
		user = USER_LOOKUP.getUserAccountFromHash(userName);
	 	return user; 
	}
	
	/**
	 * A method that is the checking of details.
	 * @throws IncorrectPasswordException
	 */
	private void check() throws IncorrectPasswordException{
		if (user.getPassword().equals(password)){
			System.out.println("proceede");
			user.zeroConsecutiveLoginAttempts();
		}else{
			throw new IncorrectPasswordException(user);
			//System.out.println("fail");
		}
	}
	
	
	
	
	/**
	 * A method that is the Setter of string userName
	 * @param userName = String
	 * @param password = string
	 */
	public void setUserNameAndPassword(String userName, String password) {
	 	this.userName = userName; 
	 	this.password = password; 
	}
	
	
	
	
	/**
	 * A method that is the Setter of string userName
	 * @param userName = string
	 */
	public void setUserName(String userName) {
	 	this.userName = userName; 
	}
	
	/**
	 * A method that is the Getter of string userName
	 * @return userName = string
	 */
	public String getUserName() {
	 	 return userName; 
	}
	
	/**
	 * A method that is theSetter of string password
	 * @param password = String
	 */
	public void setPassword(String password) {
	 	 this.password=password;
	}
	
	/**
	 * A method that is the Getter of string password
	 * @return password = string
	 */
	public String getPassword() {
	 	 return password; 
	}



}