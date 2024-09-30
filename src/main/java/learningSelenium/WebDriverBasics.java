package learningSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// Test Case:
		/* 1. Launch chrome/firefox browser
		 * 2. Enter url : https://www.demoblaze.com/
		 * 3. Get the title : 
		 * 4. Validate actual vs expected title
		 * 5. Close browser 
		 * 
		 */

		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/");
		
		//we can't launch browser without http/https, it will throw an error : InvalidArgumentException
//		driver.get("www.google.com");
		
		//we can launch browser without www
	//	driver.get("http://google.com"); 
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
				
		if(title.equals("STORE")) {
			System.out.println("Correct title -- PASS");
		}
		else {
			System.out.println("Incorrect title -- FAIL");
		}
		
		driver.quit();
	}

}
