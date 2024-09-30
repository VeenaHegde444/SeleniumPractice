package testNG;

/*
 * Can we run only @BeforeSuite without @Test?
 * Ans: No, we can't run.
 */
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OnlyBeforeMethod {
	
//	@BeforeSuite
//	public void connectWithDB() {
//		System.out.println("BS--connectWithDB");
//	}

//	@BeforeTest
//	public void createUser() {
//		System.out.println("BT--createUser");
//	}
	
//	@BeforeClass
//	public void openBrowser() {
//		System.out.println("BC--openBrowser");
//	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM--loginToApp");
	}
}
