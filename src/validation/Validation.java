package validation;


import user.UserAccount;



public class Validation {

	/**
	 * 
	 */
	private UserAccount user;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private String userName;
	
	
	/**
	 * Empty Base Constructor
	 */
	public Validation() {
	}
	
	/**
	 * 
	 * @param password
	 * @param userName
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public Validation(String password, String userName) throws UserNotFoundException, IncorrectPasswordException {

		this.password = password;
		this.userName = userName;
	getUser();
	check();
	}
	




	/**
	 * 
	 * @throws UserNotFoundException
	 * @throws IncorrectPasswordException
	 */
	public void run() throws UserNotFoundException, IncorrectPasswordException{
		user = getUser();
		check();		
	}

	
	
	
	
	
	
	/**
	 * Getter of user
	 * @throws UserNotFoundException 
	 */
	private UserAccount getUser() throws UserNotFoundException {
		user = Userlookup.getUseraccount(userName);
	 	return user; 
	}
	
	/**
	 * 
	 * @throws IncorrectPasswordException
	 */
	private void check() throws IncorrectPasswordException{
		if (user.getPassword().equals(password)){
			System.out.println("proceede");
		}else{
			throw new IncorrectPasswordException(user);
			//System.out.println("fail");
		}
	}
	
	/**
	 * Setter of userName
	 */
	public void setUserNameAndPassword(String userName, String password) {
	 	this.userName = userName; 
	 	this.password = password; 
	}
	
	/**
	 * Setter of userName
	 */
	public void setUserName(String userName) {
	 	this.userName = userName; 
	}
	
	/**
	 * Getter of userName
	 */
	public String getUserName() {
	 	 return userName; 
	}
	
	/**
	 * Getter of userName
	 */
	public void setPassword(String password) {
	 	 this.password=password;
	}
	
	/**
	 * Getter of userName
	 */
	public String getPassword() {
	 	 return password; 
	}



}