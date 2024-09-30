package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 
 */
public class Approach_6 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//using By locator + generic method for webelement & action in ElementUtil class
		
		By email_id = By.id("input-email");
		By password = By.id("input-password");
		
		//create ElementUtil class object to access non-static methods
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(email_id, "test@gmail.com");
		eUtil.doSendKeys(password, "test@123");
	}

}
