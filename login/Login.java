package login;

import validation.Validation;

public class Login {

	/** 
	 */
	private Validation validate;
	/**
	 */
	private String userName;
	/**
	 */
	private String password;


	Login(){
		
	}
	
	public Login(String userName, String password){
		this.userName = userName;
		this.password = password;
		validate = new Validation();
		validate.setUserName(userName);
		validate.setPassword(password);
		validate.run();
	
	}
	
}