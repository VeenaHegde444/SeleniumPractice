package testNG;

import org.testng.annotations.Test;

/*
 * What is the minimum & maximum value?
 * 
 * Maximum priority= 2^31-1 = 2147483647
 * Minimum priority = -2^31 =-2147483648
 */
public class MIN_MAX_VALUE {
	
//	search test
//	cart test
	
	@Test(priority=Integer.MIN_VALUE)
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	@Test(priority=Integer.MAX_VALUE)
	public void cartTest() {
		System.out.println("cart test");
	}

}
