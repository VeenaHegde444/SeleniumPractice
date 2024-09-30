package testNG;

import org.testng.annotations.Test;

/*
 *What is the execution order if we set priority for few test cases & few test cases without priority?
 * It will execute alphabetical order first & then on priority basis.
 */
public class PriorityAndWithoutPriority {
//	
//	a test
//	b test
//	c test
//	search test
//	payment test
//	cart test
	
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

	@Test
	public void aTest() {
		System.out.println("a test");
	}
	
	
	@Test
	public void bTest() {
		System.out.println("b test");
	}
	
	
	@Test
	public void cTest() {
		System.out.println("c test");
	}


}
