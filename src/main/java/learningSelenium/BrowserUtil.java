package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	//global variable, no need to initialize it, takes the default value which is null
		WebDriver driver;
		
		///** -  to write the document
		/**
		 * This method is used to initialize the driver on the basis of given browser name
		 * @param browserName
		 * @return this returns driver
		 */
		public WebDriver initDriver(String browserName) {
			System.out.println("Browser name: "+ browserName);
			
			switch (browserName.toLowerCase().trim()) {
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
				System.out.println("Please pass the right browser: "+browserName);
				throw new BrowserException("INVALID BROWSER");
			}
			
			//here we are returning driver because in case of parallel execution one thread will lock it so other threads can't access driver
			//driver is of type WebDriver, so methods return type should be WebDriver
			return driver;
		}
		
		public void launchUrl(String url) {
			
			if(url.indexOf("http") != 0) {
				throw new BrowserException("http(s) is missing from url");
			}
			driver.get(url);
		}
		
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public String getPageUrl() {
			return driver.getCurrentUrl();
		}
		
		public void quitBrowser() {
			driver.quit();
		}
		
		public void closeBrowser() {
			driver.close();
		}
}
