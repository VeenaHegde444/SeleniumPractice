package testNG;

import org.testng.annotations.Test;
/*
 * What is the execution order if priority no.s are not in increasing order?
 * In case of non-order, it will be executed based on the given order.
 */
public class NonOrderPriority {
	
//	search test
//	payment test
//	cart test
//	a test
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

	@Test(priority=5)
	public void aTest() {
		System.out.println("a test");
	}
	
	
	@Test(priority=6)
	public void bTest() {
		System.out.println("b test");
	}
	
	
	@Test(priority=10)
	public void cTest() {
		System.out.println("c test");
	}

}
