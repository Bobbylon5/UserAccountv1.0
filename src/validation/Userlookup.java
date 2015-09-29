package validation;


import user.UserAccount;

/**
 * 
 * @author robert.harkess
 *
 */
public class Userlookup {
	
	/**
	 * 
	 */
	public static final UserAccount[] people = new UserAccount[10];

	/**
	 */
	public UserAccount userAccount;



	/**
	 * 
	 */
	static {
		
		UserAccount user = new UserAccount();
		user.setLastLogin(111111);
		user.setAge(32);
		user.setName("Bobby");
		user.setUserName("userName");
		user.setPassword("password");
		people[0] = user;
		
		UserAccount user1 = new UserAccount( "Billy", "password", 32, "userName");
		people[1] = user1;
		UserAccount user2 = new UserAccount( "Benji", "password", 22, "userName");
		people[2] = user2;
	}
	
	
	/**
	 * Getter of userAccount
	 * @throws UserNotFoundException 
	 */
	public static UserAccount getUseraccount(String user) throws UserNotFoundException {
		UserAccount userAcc = getUser(user);
	 	return userAcc; 
	}

	

	/**
	 * 
	 * @param userName 
	 * @return 
	 * @throws UserNotFoundException 
	 */
	private static UserAccount getUser(String userName) throws UserNotFoundException { 
		// 
		for ( UserAccount user : people){
			if (user != null && user.getName().equals(userName)){
				return user;
			}
		}
		throw new UserNotFoundException(userName);
	 }

}