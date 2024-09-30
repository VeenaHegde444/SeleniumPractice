package testNG;
/*
 * dependsOnMethods: The list of methods this method depends on.
 * 
 * If one method fails, and other method which is dependent on 1st method, will be skipped.
 * 
 * We should never create dependency between tests.We can't achieve parallel execution if we use dependency. 
 * We should always follow 'AAA' pattern.
 */
import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="homePageTest")
	public void searchTest() {
		System.out.println("search test");
	}

}
