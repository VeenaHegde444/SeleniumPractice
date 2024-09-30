package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserRegisterTest {

	public static void main(String[] args) {
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.initializeBrowser("firefox");
		bUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//click on link
		
		By loginLink = By.linkText("Login");
		By registerLink = By.linkText("Register");
		By agreeCheckBox = By.name("agree");
		
		ElementUtil eUtil = new ElementUtil(driver);
    	eUtil.doClick(loginLink);
    	eUtil.doClick(registerLink);
    	eUtil.doClick(agreeCheckBox);
		

	}

}
