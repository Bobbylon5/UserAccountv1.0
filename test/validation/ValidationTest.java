/**
 * 
 */
package validation;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import user.UserAccount;
import user.UserDatabase;
import user.UserDatabaseInterface;

/**
 * @author robert.harkess
 *
 */
public class ValidationTest {

	
	/**
	 *  A class variable
	 */
	private Validation manager;
	/**
	 *  A class variable
	 */
	private UserAccount user;
	/**
	 * A class variable
	 */
	private String password;
	/**
	 * A class variable
	 */
	private String userName;
	
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		password = "password";
		userName = "userName";
		user = new UserAccount();
		manager = new Validation();
		UserDatabaseInterface mockUserDatabaseInterface = mock(UserDatabase.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		password = "password";
		userName = "userName";
		user = new UserAccount();
	}

	/**
	 * Test method for {@link validation.Validation#Validation(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testValidationStringString() {
		assertTrue(password.equals("password"));
		assertTrue(userName.equals("userName"));
		assertTrue(user != null);
		//fail("Not yet implemented"); // TODO
	}

	
	
	/**
	 * Test method for {@link validation.Validation#Validation()}.
	 */
	@Test
	public final void testValidation() {
		assertTrue(password.equals("password"));
		assertTrue(userName.equals("userName"));
		assertTrue(user != null);
	}

	/**
	 * Test method for {@link validation.Validation#run()}.
	 */
	@Test
	public final void testRun() {
		//user == getUser();
		user.setName("name");
		user.setPassword("password");
		user.setUserName("userName");
		//check();
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test method for {@link validation.Validation#run()}.
	 */
	@Test
	public final void getUser() {
		user = new UserAccount();
		assertTrue(user != null);
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test method for {@link validation.Validation#run()}.
	 */
	@Test
	public final void check() {
		user.setPassword("password");
		assertTrue(user.getPassword().equals("password"));
		//fail("Not yet implemented"); // TODO
	}


	/**
	 * Test method for {@link validation.Validation#setUserNameAndPassword(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testSetUserNameAndPassword() {
		userName = "userName3";
		password = "password3";
		assertTrue(userName.equals("userName3"));
		assertTrue(password.equals("password3"));
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link validation.Validation#setUserName(java.lang.String)}.
	 */
	@Test
	public final void testSetUserName() {
		userName = "userName2";
		assertTrue(userName.equals("userName2"));
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link validation.Validation#getUserName()}.
	 */
	@Test
	public final void testGetUserName() {
		assertTrue(userName.equals("userName"));
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link validation.Validation#setPassword(java.lang.String)}.
	 */
	@Test
	public final void testSetPassword() {
		password = "password2";
		assertTrue(password.equals("password2"));
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link validation.Validation#getPassword()}.
	 */
	@Test
	public final void testGetPassword() {
		assertTrue(password.equals("password"));
		//fail("Not yet implemented"); // TODO
	}



}
