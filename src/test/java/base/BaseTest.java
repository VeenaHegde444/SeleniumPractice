package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/*
 * BaseTest: It is not coming from TestNG. It is just a java class where all common code can be placed so that it will act like a parent
 * & other classes can extend it.
 * 
 * In BaseTest class, 'driver' should be 'protected'. If we make it 'public' any class or package can access it.
 * 
 * @Parameters : Describes how to pass parameters to a @Test method.
 * 
 * When we add @Parameters, we should run using testng.xml file. Here it is a sequential execution, tests will run one by one.
 * 
 * To run using the class file, we should add @Optional parameter.
 */
public class BaseTest {
	
	protected WebDriver driver;
	
	@Parameters({"url","browser"}) //testng.xml parameter names and @Parameters {} names should match
	@BeforeTest
//	public void setUp(String url,String browserName) { // here input parameter can be of any name
	
	public void setUp(@Optional("https://www.google.com/") String url,@Optional("chrome") String browserName) {
		
		System.out.println("browser is: "+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please enter the right browser: "+browserName);
			throw new IllegalArgumentException("Wrong Browser: "+browserName);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
