/**
 * 
 */
package user;

import java.util.Map;
import java.util.TreeMap;

/**
 * A class that creates stores manipulates and destroys user accounts in a hastree of user accounts
 * @author robert.harkess
 *
 */
public class UserDatabase implements UserDatabaseInterface {
	
	/**
	 * An ordered tree map to store the user account information
	 */
	private static final Map<String, UserAccount> DATABASE = new TreeMap<String, UserAccount>();
	
	/**
	 * Some pre-formatted entries to go in the database
	 */
	static{
		UserAccount user = new UserAccount( "Bobby", "password", 35, "userName");
		DATABASE.put(user.getUserName(), user);
		UserAccount user1 = new UserAccount( "Billy", "password", 32, "userName1");
		DATABASE.put(user1.getUserName(), user1);
		UserAccount user2 = new UserAccount( "Benji", "password", 22, "userName2");
		DATABASE.put(user2.getUserName(), user2);
		UserAccount user3 = new UserAccount( "Stuart", "password", 28, "Stuart");
		DATABASE.put(user3.getUserName(), user2);
	}
	
	/**
	 * Method to put a user into the hasmap
	 * @param user = UserAccount object
	 * @throws UserAlreadyExists 
	 */
	protected void add(UserAccount userName) throws UserAlreadyExists{
		if ( DATABASE.containsKey(userName) ) {
			throw new UserAlreadyExists(userName);
		}else{
		DATABASE.put(userName.getUserName(), userName);
		}
	}
	
	public boolean checkUserAccount(String userName){
		if ( DATABASE.containsKey(userName) ) {
			return true;
		}
		return false;
	}

	@Override
	public UserAccount getUserAccount(String user) throws UserNotFoundException {
		if ( DATABASE.containsKey(user) ) {
			return DATABASE.get(user);
		}
		throw new UserNotFoundException(user);
	}

	@Override
	public void createUser(String name, String password, int age, String userName) throws UserAlreadyExists {
		UserAccount user = new UserAccount( name, password, age, userName);
		add(user);
	}

	@Override
	public void createUser(UserAccount user) throws UserAlreadyExists {
		add(user);
	}

	@Override
	public boolean updateUser(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String userName) throws UserNotFoundException  {
		if ( DATABASE.containsKey(userName) ) {
			DATABASE.remove(userName);
			return true;
		}else{
		throw new UserNotFoundException(userName);
		}
	}

	@Override
	public UserAccount getUserAccountFromArray(String user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAccount getUserAccountFromHash(String userName) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}


	
}
