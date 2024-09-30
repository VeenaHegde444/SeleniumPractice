package testNG;

import org.testng.annotations.Test;

/*
 * Lowest priority will be executed first.
 */

public class NegativePriority {
	
//	search test
//	a test
//	payment test
//	b test
//	cart test
//	c test
	
	@Test(priority=-1)
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	@Test(priority=3)
	public void cartTest() {
		System.out.println("cart test");
	}
	
	
	@Test(priority=1)
	public void paymentTest() {
		System.out.println("payment test");
	}

	@Test(priority=0)
	public void aTest() {
		System.out.println("a test");
	}
	
	
	@Test(priority=2)
	public void bTest() {
		System.out.println("b test");
	}
	
	
	@Test(priority=4)
	public void cTest() {
		System.out.println("c test");
	}

}
