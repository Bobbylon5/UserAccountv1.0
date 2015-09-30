package user;

public class UserAlreadyExists extends Exception {

	/**
	 * variable of type user account called user
	 */
	UserAccount user;

	/**
	 * Constructor that takes a user account as a parameter to be stored
	 * @param user = UserAccount
	 */
	public UserAlreadyExists(UserAccount user) {
		super();
		this.user = user;
	}

	/**
	 *  The user name of the account that is being created already exists
	 */
	@Override
	public String toString() {
		return "The user name: " + user.getUserName() + " already exists.";
	}
	
}
