package user;

import java.util.Arrays;

public class UserAccount {

	/**
	 * integer variable to hold when the last login was ddmmyy
	 */
	private int lastLogin;
	/**
	 * string variable to hold the persons name
	 */
	private String name;
	/**
	 * string to hold the persons password
	 */
	private String password;
	/**
	 * character array to hold a different version of the password the persons password
	 */
	private char[] password2;
	/**
	 * integer primitive to hold the persons age
	 */
	private int age;
	/**
	 * String to hold the persons user name
	 */
	protected String userName;
	/**
	 * integer to store the number of consecutive failed login attempts
	 */
	protected int consecutiveLoginAttempts;

	/**
	 * Empty constructor for the user account class,
	 * Used to create an empty account when needed.
	 */
	public UserAccount() {

	}
	
	/**
	 * Overloaded constructor that requires four parameter, name password, age and username
	 * @param name = String
	 * @param password = String
	 * @param age = integer
	 * @param userName =  String
	 */
	public UserAccount( String name, String password, int age, String userName) {
		this.name = name;
		this.password = password;
		this.age = age;
		this.userName = userName;
	}
	
	/**
	 * Simple method to incriment the number of login attempts
	 */
	public void addConsecutiveLoginAttempts(){
		consecutiveLoginAttempts++;	
	}
	/**
	 * a method to zero the current login attempts
	 */
	public void zeroConsecutiveLoginAttempts(){
		consecutiveLoginAttempts = 0;	
	}
	/**
	 * A method to return the number that is the number of successive unsucessful login attempts
	 * @return = int 
	 */
	public int getAttempts(){
		return consecutiveLoginAttempts;	
	}
	
	
	/**
	 * Getter of LastLogin to return the last login date in format ddmmyy
	 * @return = int
	 */
	public int getLastLogin() {
	 	 return lastLogin; 
	}
	/**
	 * Setter of LastLogin in an int ddmmyy
	 * @param lastLogin = int (format ddmmyy)
	 */
	public void setLastLogin(int lastLogin) { 
		 this.lastLogin = lastLogin; 
	}
	/**
	 * A method to return the Name on the account
	 * @return name = string
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 * @param name = string
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * Method 
	 * @return password = string
	 */
	public String getPassword() {
	 	 return password; 
	}
	/**
	 * Setter of password
	 * @param password = string
	 */
	public void setPassword(String password) { 
		 this.password = password; 
	}
	/**
	 * Method to get (return) the age variable
	 * @return
	 */
	public int getAge() {
	 	 return age; 
	}
	/**
	 * A method to set the age
	 * @param age = int
	 */
	public void setAge(int age) { 
		 this.age = age; 
	}
	/**
	 * A method to return the user name
	 * @return userName = string
	 */
	public String getUserName() {
	 	 return userName; 
	}
	/**
	 * A method to set the user name 
	 * @param userName = String
	 */
	public void setUserName(String userName) { 
		 this.userName = userName; 
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + consecutiveLoginAttempts;
		result = prime * result + lastLogin;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + Arrays.hashCode(password2);
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (age != other.age)
			return false;
		if (consecutiveLoginAttempts != other.consecutiveLoginAttempts)
			return false;
		if (lastLogin != other.lastLogin)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (!Arrays.equals(password2, other.password2))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	

}