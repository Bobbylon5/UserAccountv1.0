package user;

/**
 * 
 * @author robert.harkess
 *
 */
public class Userlookup implements UserlookupInterface {
	
	/**
	 * An array of user accounts called people set to a maximum length of 10
	 * v1.0
	 */
	public static final UserAccount[] people = new UserAccount[10];

	/**
	 * The population of the UserAccount array called people.
	 */
	static {	
		UserAccount user = new UserAccount( "Bobby", "password", 36, "userName");
		people[0] = user;
		UserAccount user1 = new UserAccount( "Billy", "password", 32, "userName");
		people[1] = user1;
		UserAccount user2 = new UserAccount( "Benji", "password", 22, "userName");
		people[2] = user2;
	}
	
	
	
	@Override
	public UserAccount getUserAccountFromArray(String userName) throws UserNotFoundException {
		for ( UserAccount user : people){
			if (user != null && user.getName().equals(userName)){
				return user;
			}
		}
		throw new UserNotFoundException(userName);
	}
	
	@Override
	public UserAccount getUserAccountFromHash(String userName) throws UserNotFoundException {
		UserDatabaseInterface inter = new UserDatabase();
		UserAccount userAccount = inter.getUserAccount(userName);
		return userAccount;	
	}

}