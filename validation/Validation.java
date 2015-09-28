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
	
	
	
	
	
	public Validation(String password, String userName) {

		this.password = password;
		this.userName = userName;
	getUser();
	check();
	}
	

	public Validation() {
		
	
	}


	
	public void run(){
		user = getUser();
		check();		
	}

	/**
	 * Getter of user
	 */
	private UserAccount getUser() {
		user = Userlookup.getUseraccount(userName);
	 	return user; 
	}
	
	private void check(){
		if (user.getPassword().equals(password)){
			System.out.println("proceede");
		}else{
			System.out.println("fail");
		}
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

	
	
	/**
	 * 
	 */
	private void verifyPassword() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void verifyUser() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	private void verifyUserName() { 
		// TODO Auto-generated method
	 } 

}