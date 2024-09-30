package learningSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.*;

public class TopCastingOptions {

	public static void main(String[] args) {
		//1.Valid but only for local --only for Chrome browser
		//ChromeDriver driver = new ChromeDriver();
		
		//2.recommended & valid --local , can be used for cross browser testing
		//WebDriver is a Interface, it provides 100% abstraction, so it is the best way to create the browser
		//ChromeDriver() is a child, so child class object is referring to the parent Interface reference variable
		//we can access all methods of WebDriver as well as SearchContext
		// WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		//3.recommended & valid --remote machine (cloud, AWS,Docker) -GRID
		//we should go with this when we have a remote machine & if we want to run in cloud, AWS or something
		//WebDriver driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		//4.valid but not recommended, 
		//SearchContext is a Interface,it has only 2 methods: findElement & findElements, so we can access only 2 methods
		//SearchContext driver = new ChromeDriver();
		
		//5.recommended & valid, can access all methods of WebDriver because RemoteWebDriver class implements WebDriver Interface.
		//RemoteWebDriver is a class, here child class is referring to the parent class reference variable
		//Valid, but Java recommends to use top casting with parent interface instead of using class
		//we can't access any methods of ChromeDriver(they have not created any individual methods) , one constructor is available that is also protected
		// RemoteWebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		
		//6.valid but only for chrome/edge, can't create object of firefox, safari etc
		//ChromiumDriver has a protected constructor, so we can't create the object of the same
		// ChromiumDriver driver = new ChromeDriver();
		
		//7.valid but not recommended, will get only two methods findElement & findElements
		//SearchContext driver = new RemoteWebDriver();

	}

}
