package user;

public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	String username;

	/**
	 * 
	 * @param username
	 */
	public UserNotFoundException(String username) {
		super();
		this.username = username;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return username + " not found";
	}
	
	
}
