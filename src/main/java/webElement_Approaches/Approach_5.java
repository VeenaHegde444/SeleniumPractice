package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * We can improve further.
 */
public class Approach_5 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//using By locator + generic method for webelement & action
		
		By email_id = By.id("input-email");
		By password = By.id("input-password");
		
		doSendKeys(email_id,"test@gmail.com");
		doSendKeys(password,"test@123");


	}
	
	/**
	 * 
	 * @param this method takes 'By' locator as a parameter
	 * @return this will return WebElement
	 */
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	/**
	 * This method is used to enter the values in a text field, which takes By locator & String value as a parameter
	 * @param this method takes 'By' locator as a parameter
	 * @param this method takes String value
	 */
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);//here we are calling getElement method which takes locator & returning WebElement, 
		//so we can perform action on it 
	}

}
