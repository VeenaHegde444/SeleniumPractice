package practice_Selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	//global variable, no need to initialize
	WebDriver driver;

	public WebDriver initializeBrowser(String browserName) {

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
			System.out.println("Please pass the right browser: "+browserName);
			throw new BrowserException("Browser Not Supported!");
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	public void launchURL(String url) {
		if(url.indexOf("http") != 0) {
			throw new BrowserException("http(s) is missing in url");
		}
		driver.get(url);
	}
	
	public void launchURL(URL url) {
		driver.navigate().to(url);
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
