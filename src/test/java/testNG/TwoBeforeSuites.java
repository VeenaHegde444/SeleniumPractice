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

//Can we have two BeforeSuite?
//Yes, it will not show any error, it will execute based on alphabetical order
//Generally we don't write two @Before & @After methods, instead of that combine them

public class TwoBeforeSuites {
	
//	BS--connectWithAPI
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
	    //2
		@BeforeSuite
		public void connectWithDB() {
			System.out.println("BS--connectWithDB");
		}
		
		//1
		@BeforeSuite
		public void connectWithAPI() {
			System.out.println("BS--connectWithAPI");
		}
		
		//combine both of them into single method
//		@BeforeSuite
//		public void connectWithAPI() {
//		System.out.println("BS--connectWithAPI");
//		System.out.println("BS--connectWithAPI");
//		}
		//3
		@BeforeTest
		public void createUser() {
			System.out.println("BT--createUser");
		}
		
		//4
		@BeforeClass
		public void openBrowser() {
			System.out.println("BC--openBrowser");
		}
		
		//5 //8 //11
		@BeforeMethod
		public void loginToApp() {
			System.out.println("BM--loginToApp");
		}
		
		//12
		@Test
		public void searchTest() {
			System.out.println("search test");
		}
		
		//6
		@Test
		public void cartTest() {
			System.out.println("cart test");
		}
		
		//9
		@Test
		public void paymentTest() {
			System.out.println("payment test");
		}
		
		//7 //10 //13
		@AfterMethod
		public void logout() {
			System.out.println("AM--logout");
		}
		
		//14
		@AfterClass
		public void closeBrowser() {
			System.out.println("AC--close browser");
		}
		
		//15
		@AfterTest
		public void deleteUser() {
			System.out.println("AT--delete user");
		}
		
		//16
		@AfterSuite
		public void disconnectWithDB() {
			System.out.println("AS--disconnectWithDB");
		}

}
