package testNG;

import org.testng.annotations.Test;


/*TestNG : It is a unit testing framework inspired from JUnit & NUnit.
*It is designed to cover all categories of tests: unit, functional, end-to-end,integration etc
*It supports only Java.
*It is open source & free.
*Selenium is used for browser automation not for writing the test cases.
*We need TestNG to write the test cases.
*Selenium(UI Automation + Java) + TestNG( test cases) --->UI Test Automation
*
*Test Case:
*global pre conditions
*pre conditions
*test steps + expected vs actual --->test case
*post steps
*
*We don't select the main method.


*/
public class TestNG_Concept {
	
	@Test
	public void login() {
		System.out.println("Hello from TestNG");
	}

}
