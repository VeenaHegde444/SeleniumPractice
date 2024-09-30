package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * We can improve more.
 */
public class Approach_4 {

	//make the WebDriver static so that we can access it in other static methods
	//global variable
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//using By locator + generic method for webelement
		
		By email_id = By.id("input-email");
		By password = By.id("input-password");
		
		getElement(email_id).sendKeys("test@gmail.com");
		getElement(password).sendKeys("test@123");



	}
	
	/**
	 * This method takes a 'By' locator as a parameter & returns WebElement
	 * @param takes a 'By' locator as a parameter
	 * @return it returns WebElement
	 */
	
	//for getElement method we have to supply By locator
	//By class and reference variable - call by reference
	//this method is called a wrapper method, using driver.findElement we have created our own method
	//here we are writing only one time driver.findElement
	//hitting the server only once
	//re-usability, less calling on the server, better maintenance
	public static WebElement getElement(By locator) { //here locator is a reference variable
		return driver.findElement(locator);//returns WebElement
	}

}
