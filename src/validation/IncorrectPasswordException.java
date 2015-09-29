package validation;

import user.UserAccount;

/**
 * 
 * @author robert.harkess
 *
 */
public class IncorrectPasswordException extends Exception {

	/**
	 * 
	 */
	UserAccount user;

	/**
	 * 
	 * @param user
	 */
	public IncorrectPasswordException(UserAccount user) {
		super();
		this.user = user;
	}


	/**
	 * 
	 * @return
	 */
	public int attempts() {
		// TODO Auto-generated method stub
		user.addConsecutiveLoginAttempts();
		int attempts = user.getAttempts();
		return attempts;
	}
	
	
}
