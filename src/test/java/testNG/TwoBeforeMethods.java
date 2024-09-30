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

//Can we have two BeforeMethod?
//Yes, it will not show any error, it will execute based on alphabetical order
//Generally we don't write two @BeforeMethod
public class TwoBeforeMethods {
	
//	BS--connectWithDB
//	BS--connectWithAPI
//	BT--createUser
//	BC--openBrowser
//	BM--clearCache
//	BM--loginToApp
//	cart test
//	AM--logout
//	BM--clearCache
//	BM--loginToApp
//	payment test
//	AM--logout
//	BM--clearCache
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
			
			//5
			@BeforeMethod
			public void loginToApp() {
				System.out.println("BM--loginToApp");
			}
			
			//4
			@BeforeMethod
			public void clearCache() {
				System.out.println("BM--clearCache");
			}
			
			//combine both of them into single method
//			@BeforeMethod
//			public void loginToApp() {
//				System.out.println("BM--loginToApp");
//				System.out.println("BM--clearCache");
//			}
			
			//
			@Test
			public void searchTest() {
				System.out.println("search test");
			}
			
			//
			@Test
			public void cartTest() {
				System.out.println("cart test");
			}
			
			//
			@Test
			public void paymentTest() {
				System.out.println("payment test");
			}
			
			//
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
