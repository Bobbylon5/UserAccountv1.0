/**
 * 
 */
package validation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import user.UserAccount;

/**
 * @author robert.harkess
 *
 */
public class UserlookupTest {
	
	/**
	 */
	public static final UserAccount[] people = new UserAccount[10];

	/**
	 */
	public UserAccount userAccount;

	
	
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		UserAccount user = new UserAccount();
		user.setLastLogin(111111);
		user.setAge(32);
		user.setName("Bobby");
		user.setUserName("userName");
		user.setPassword("password");
		people[0] = user;
		
		UserAccount user1 = new UserAccount( "Billy", "password", 32, "userName");
		people[1] = user1;
		UserAccount user2 = new UserAccount( "Benji", "password", 22, "userName");
		people[2] = user2;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * Test method for {@link validation.Userlookup#getUseraccount(java.lang.String)}.
	 */
	@Test
	public final void testGetUseraccount() {
		//UserAccount userAcc = getUser("Bobby");

		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test method for
	 * {@link validation.Userlookup#getUseraccount(java.lang.String)}.
	 */
	@Test  //(expected = UserNotFoundException.class)
	public final void testGetUser() {
		for (UserAccount user : people) {
			if (user.getName().equals("Bobby")) {
				assertTrue(user.getName().equals("Bobby"));
				break;
			}
		}
		// throw new UserNotFoundException(userName);

	}

}
