package user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserDatabaseTest {

	private static final String TEST_USERNAME = "test";
	private UserDatabase userDatabase;
	
	private UserAccount user;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		userDatabase = new UserDatabase();
		user = new UserAccount();
		user.setUserName(TEST_USERNAME);
		UserAccount user2 = new UserAccount( "Bobby", "password", 35, "userName");
		UserAccount user3 = new UserAccount( "Billy", "password", 32, "userName1");
		UserAccount user4 = new UserAccount( "Benji", "password", 22, "userName2");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() throws UserAlreadyExists {
		//UserAccount user2 = new UserAccount( "Bobby", "password", 35, "userName");
		//userDatabase.add(user2);
		System.out.println(userDatabase.checkUserAccount("userName"));
		assertTrue(userDatabase.checkUserAccount("userName"));
		//fail("Not yet implemented");
	}

	@Test
	public void testGetUserAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateUserStringStringIntString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateUserUserAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserAccountFromArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserAccountFromHash() {
		fail("Not yet implemented");
	}

}
