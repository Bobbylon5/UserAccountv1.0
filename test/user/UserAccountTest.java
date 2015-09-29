package user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserAccountTest {
	
	UserAccount testUser;
	int testNo = 0;


	@Before
	public void setUp() throws Exception {
		testUser = new UserAccount();
		System.out.println("test Setup:  " + testNo);
		testNo++;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testUserAccount() {
		assertTrue(testUser.getName() == null);
		assertTrue(testUser.getPassword() == null);
		assertTrue(testUser.getAge() == 0);
		assertTrue(testUser.getUserName() == null);
		testUser.setName("B");
		testUser.setPassword("B");
		testUser.setAge(1);
		testUser.setUserName("B");
		assertTrue(testUser.getName().equals("B"));
		assertTrue(testUser.getPassword().equals("B"));
		assertTrue(testUser.getAge() == 1);
		assertTrue(testUser.getUserName().equals("B"));
		//fail("Outline constructor not fully working");
	}

	@Test
	public final void testUserAccountStringStringIntString() {
		
		fail("Overloaded constructor Not yet implemented");
	}

	@Test
	public final void testAddConsecutiveLoginAttempts() {
		testUser.addConsecutiveLoginAttempts();
		assertTrue(testUser.getAttempts() == 1);
		//fail("Add login attempts not working"); 
	}

	@Test
	public final void testZeroConsecutiveLoginAttempts() {
		testUser.addConsecutiveLoginAttempts();
		testUser.addConsecutiveLoginAttempts();
		assertTrue(testUser.getAttempts() == 2);
		testUser.zeroConsecutiveLoginAttempts();
		assertTrue(testUser.getAttempts() == 0);
		//fail("Zero login attempts not working");
	}

	@Test
	public final void testGetAttempts() {
		assertTrue(testUser.getAttempts() == 0);
		//fail("Get Attempts not working"); 
	}

	@Test
	public final void testGetLastLogin() {
		assertTrue(testUser.getLastLogin() == 0);
		//fail("get last login not working"); 
	}

	@Test
	public final void testSetLastLogin() {
		testUser.setLastLogin(5);
		assertTrue(testUser.getLastLogin() == 5);
		//fail("Set last login not working"); 
	}

	@Test
	public final void testGetName() {
		assertTrue(testUser.getName() == null);
		//fail("get name not working");
	}

	@Test
	public final void testSetName() {
		testUser.setName("Bobby");
		assertTrue(testUser.getName().equals("Bobby"));
		//fail("Test set name not working"); 
	}

	@Test
	public final void testGetPassword() {
		assertTrue(testUser.getPassword() == null);
		//fail("Test password is not working"); 
	}

	@Test
	public final void testSetPassword() {
		testUser.setPassword("Password");
		assertTrue(testUser.getPassword().equals("Password"));
		//fail("Test set password is not working"); 
	}

	@Test
	public final void testGetAge() {
		assertTrue(testUser.getAge() == 0);
		//fail("Get age is not Working"); 
	}

	@Test
	public final void testSetAge() {
		testUser.setAge(5);
		assertTrue(testUser.getAge() == 5);
		//fail("Test set name not working"); 
	}

	@Test
	public final void testGetUserName() {
		assertTrue(testUser.getUserName() == null);
		//fail("Test set user name not working"); 
	}

	@Test
	public final void testSetUserName() {
		testUser.setUserName("Bobby2001");
		assertTrue(testUser.getUserName().equals("Bobby2001"));
		//fail("Test set user name not working"); 
	}

}
