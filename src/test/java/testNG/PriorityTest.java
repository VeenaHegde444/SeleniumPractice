package testNG;

import org.testng.annotations.Test;

/*
 * Priority: It is set for @Test methods.
 * Test cases with lower priority will be executed first.
 * Default test priority is '0'.
 * 
 * Maximum priority= 2^31-1 = 2147483647
 * Minimum priority = -2^31 =-2147483648
 * 
 * Can we give decimal priority like 2.5 in TestNG?
 * Ans: No, since priority accepts only 'int'
 * 
 * 
 * Is it a good practice to define the priorities?
 * Not a good practice.
 * 
 * AAA pattern for automation: Arrange,Act,Assert
 * 
 * CRUD: 
 * CreateUserTest
 * RetrieveUserTest
 */
public class PriorityTest {
	
//	a test
//	search test
//	payment test
//	cart test
//	b test
//	c test
	
	@Test(priority=1)
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	@Test(priority=3)
	public void cartTest() {
		System.out.println("cart test");
	}
	
	
	@Test(priority=2)
	public void paymentTest() {
		System.out.println("payment test");
	}

	@Test(priority=0)
	public void aTest() {
		System.out.println("a test");
	}
	
	
	@Test(priority=4)
	public void bTest() {
		System.out.println("b test");
	}
	
	
	@Test(priority=5)
	public void cTest() {
		System.out.println("c test");
	}
}
