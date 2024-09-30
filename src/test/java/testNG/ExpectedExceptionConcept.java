package testNG;
/*
 * expectedExceptions: The list of exceptions that a test method is expected to throw. If no exception or a different than one on this list is thrown, 
 * this test will be marked a failure.
 * 
 * In case of multiple exceptions, needs to be grouped in {} with comma separated.
 */
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	int age;
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void paymentTest() {
		System.out.println("payment test");
		int i=9/0;
		
		ExpectedExceptionConcept obj =null;
		obj.age=20;//NPE
		
	}

}
