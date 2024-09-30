package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		String browser = "firefox ";
		
		//initially we set WebDriver=null because it is a local variable, we have to initialize it before using it 
		WebDriver driver = null;
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser: "+browser);
			//if we dont throw our custom exception we will get NullPointerException bcoz initially we have set WebDriver=null
			
			throw new BrowserException("INVALID BROWSER NAME");		
			}
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}
	
	

}
