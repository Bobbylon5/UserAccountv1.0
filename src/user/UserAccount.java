package user;



public class UserAccount {

	/**
	 */
	private int lastLogin;
	/**
	 */
	private String name;
	/**
	 */
	private String password;
	/**
	 */
	private int age;
	/**
	 */
	protected String userName;
	/**
	 */
	protected int consecutiveLoginAttempts;

	/**
	 * 
	 */
	public UserAccount() {

	}
	
	/**
	 * 
	 * @param name
	 * @param password
	 * @param age
	 * @param userName
	 */
	public UserAccount( String name, String password, int age, String userName) {
		this.name = name;
		this.password = password;
		this.age = age;
		this.userName = userName;
	}
	
	/**
	 * 
	 */
	public void addConsecutiveLoginAttempts(){
		consecutiveLoginAttempts++;	
	}
	/**
	 * 
	 */
	public void zeroConsecutiveLoginAttempts(){
		consecutiveLoginAttempts = 0;	
	}
	/**
	 * 
	 * @return
	 */
	public int getAttempts(){
		return consecutiveLoginAttempts;	
	}
	
	
	/**
	 * Getter of LastLogin
	 */
	public int getLastLogin() {
	 	 return lastLogin; 
	}
	/**
	 * Setter of LastLogin
	 */
	public void setLastLogin(int lastLogin) { 
		 this.lastLogin = lastLogin; 
	}
	/**
	 * 
	 * @return
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * 
	 * @return
	 */
	public String getPassword() {
	 	 return password; 
	}
	/**
	 * Setter of password
	 */
	public void setPassword(String password) { 
		 this.password = password; 
	}
	/**
	 * Getter of age
	 */
	public int getAge() {
	 	 return age; 
	}
	/**
	 * Setter of age
	 */
	public void setAge(int age) { 
		 this.age = age; 
	}
	/**
	 * 
	 */
	public String getUserName() {
	 	 return userName; 
	}
	/**
	 * Setter of userName
	 */
	public void setUserName(String userName) { 
		 this.userName = userName; 
	}
	

}