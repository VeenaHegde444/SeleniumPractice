package learningSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumManager {

	public static void main(String[] args) {
		
		//setting System.setProperty
		
		//browser-chrome 126 version, need to download chromedriver.exe of same version
		//if we are using chrome 115 or newer, we need to go to Chrome for Testing availability (CFT) dashboard
		//need to download chromedriver.exe(126.exe) version
		//these .exe files will be provided by respective browser vendors
		//here browser version (126) & chromedriver.exe(126) version should match, otherwise we will get compatibility issues
	//	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		
		//chrome browser (126) --> chromedriver.exe(126.exe)
		
		ChromeDriver driver = new ChromeDriver();
		//Selenium Manager-SM :
		/*SM provides automated driver & browser management for Selenium. Selenium bindings use this tool by default, so we don't have to 
		 * download chromedriver.exe file (acts as a server) & set the System.setProperty anymore.
		 * Before Selenium 4.6 version, selenium users need  to place a component called 'driver' (chromedriver, geckodriver, msedgedriver, etc)
		 * between the script using Selenium API & the browser.
		 * 
		 * SM will automatically downloads the respective driver.exe file & stores it in .cache folder (C:\Users\aksha\.cache)
		 */

		//How to check whether the server is started?
	   // Ans: Go to Task Manager >> chromedriver
		
		//if we don't use driver.quit(), in Task Manager, when we run the script each time it will keep creating chromedriver
		
	//	EdgeDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		driver.quit();
		

	}

}
