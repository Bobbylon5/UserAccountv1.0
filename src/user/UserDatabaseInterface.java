package user;

public interface UserDatabaseInterface extends UserlookupInterface {

	/**
	 * a createUser method that requires a string name and password, then an int age, then a string userName
	 * @param name = String
	 * @param password = String
	 * @param age = integer
	 * @param userName = String
	 * @throws UserAlreadyExists 
	 */
	void createUser(String name, String password, int age, String userName) throws UserAlreadyExists;
	
	/**
	 * A create user method that only accepts a user account.
	 * @param user = UserAccount
	 * @throws UserAlreadyExists 
	 */
	void createUser(UserAccount user) throws UserAlreadyExists;
	
	
	

	/**
	 * **************************** Currently not finished
	 * @param userName
	 * @return
	 */
	boolean updateUser(String userName);
	
	/**
	 * A method to delete a user that takes a single argument, the user name, finds and deletes the user, returning true if was deleted. If not an exception is thrown.
	 * @param userName = String
	 * @return boolean true (if deleted)
	 * @throws UserNotFoundException if user was not found
	 */
	boolean deleteUser(String userName) throws UserNotFoundException ;

	/**
	 * A method to return a user account given a user name in string format
	 * @param userName = String
	 * @return User Account
	 * @throws UserNotFoundException (if the user is not found)
	 */
	UserAccount getUserAccount(String userName) throws UserNotFoundException;





}