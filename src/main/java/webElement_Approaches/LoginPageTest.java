package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.initializeBrowser("firefox");
		bUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(bUtil.getPageTitle());		
		
		By emailID = By.id("input-email");
	    By password = By.id("input-password");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(emailID, "test@gmail.com");
		eUtil.doSendKeys(password, "test@123");
		
		bUtil.quitBrowser();
		

	}

}
