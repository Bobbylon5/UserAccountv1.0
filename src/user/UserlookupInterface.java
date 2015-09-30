package user;

public interface UserlookupInterface {

	
	/**
	 * User Account Array v1.0
	 * Getter of userAccount from the User account Array
	 * @param userName 
	 * @return 
	 * @throws UserNotFoundException 
	 */
	UserAccount getUserAccountFromArray(String user) throws UserNotFoundException;

	/**
	 * User Database Hash Tree v2.0
	 * Getter of userAccount from the user database, takes the string "userName" and returns the corresponding user account
	 * if it exists, is not an exception will be thrown.
	 * @param userName = string
	 * @return = UserAccount
	 * @throws UserNotFoundException 
	 */
	UserAccount getUserAccountFromHash(String userName) throws UserNotFoundException;


	
	
}
