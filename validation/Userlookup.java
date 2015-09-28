package validation;


import user.UserAccount;

public class Userlookup {
	
	
	public static final UserAccount[] people = new UserAccount[10];

	/**
	 */
	public UserAccount userAccount;
	/**
	 */
	private String userName;


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
		
		people[2].setLastLogin(111113);
		people[2].setAge(22);
		people[2].setName("Benji");
		people[2].setUserName("userName");
		people[2].setPassword("password");
	}
	
	
	/**
	 * Getter of userAccount
	 */
	public static UserAccount getUseraccount(String user) {
		UserAccount userAcc = getUser(user);
	 	return userAcc; 
	}

	

	/**
	 * 
	 * @param userName 
	 * @return 
	 */
	private static UserAccount getUser(String userName) { 
		// 
		for ( UserAccount user : people){
			if (user != null && user.getName().equals(userName)){
				return user;
			}
		}
		return null;
	 }

}