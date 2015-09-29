package main;

public class NoConsoleException extends Exception {
	String error;
	
	/**
	 * 
	 * @param username
	 */
	public NoConsoleException() {
		error = "Console not found!";
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return error + " ... ";
	}
}
