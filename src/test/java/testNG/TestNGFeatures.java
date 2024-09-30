package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	//TestNG annotation order of execution:
	
	/*
	 * @BeforeSuite: The annotated method will be run before all tests in this suite have run.
	 * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	 * @BeforeMethod: Runs before every @Test method
	 * @Test
	 * @AfterMethod: Runs after every @Test method
	 * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	 * @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	 * @AfterSuite:The annotated method will be run after all tests in this suite have run.
	 */

	//all these annotations are coming from pom.xml file
	//every annotation starts with '@' & followed by a method 
	//its not mandatory to write in the same sequence
	
	//can we run only @Test methods without @Before & @After methods?  
	//Ans: Yes, we can run
	
	//can we run only @BeforeSuite method without @Test?
	//Ans: No
	
	
	//BeforeMethod & AfterMethod runs for every @Test method
	//In case of multiple @Test methods, then it will execute in alphabetical order
	//if we have defined Priority then based on priority it will execute
	//if few @Test methods are without priority & few are with priority then first it will execute in alphabetical order then on priority basis
	//default priority is 0
	//BeforeSuite,BeforeTest,BeforeClass will be run only once
	//AfterSuite,AfterTest,AfterClass will be run only once
	//main() method is not required to run test cases with TestNG
	
	
//	BS--connectWithDB
//	BT--createUser
//	BC--openBrowser
//	BM--loginToApp
//	cart test
//	AM--logout
//	BM--loginToApp
//	payment test
//	AM--logout
//	BM--loginToApp
//	search test
//	AM--logout
//	AC--close browser
//	AT--delete user
//	AS--disconnectWithDB
	
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS--connectWithDB");
	}
	
	
	@BeforeSuite
	public void connectWithAPI() {
		System.out.println("BS--connectWithAPI");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT--createUser");
	}
	
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC--openBrowser");
	}
	
	//4 //7 //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM--loginToApp");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	//5
	@Test
	public void cartTest() {
		System.out.println("cart test");
	}
	
	//8
	@Test
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	//6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--close browser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--delete user");
	}
	
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS--disconnectWithDB");
	}
}
