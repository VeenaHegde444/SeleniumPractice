package testNG;

import org.testng.annotations.Test;

/*
 * What is the execution order if all methods have same priority?
 * 
 * In this case, it will ignore the priority & executes based on alphabetical order.
 */
public class SamePriority {
//	cart test
//	payment test
//	search test
//	a test
//	b test
//	c test

	
	@Test(priority=1)
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	@Test(priority=1)
	public void cartTest() {
		System.out.println("cart test");
	}
	
	
	@Test(priority=1)
	public void paymentTest() {
		System.out.println("payment test");
	}

	@Test(priority=5)
	public void aTest() {
		System.out.println("a test");
	}
	
	
	@Test(priority=5)
	public void bTest() {
		System.out.println("b test");
	}
	
	
	@Test(priority=5)
	public void cTest() {
		System.out.println("c test");
	}


}
