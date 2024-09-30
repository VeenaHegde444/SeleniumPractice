package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * JavaScriptExecutor: User opens a URL & there is an unexpected pop-up that will prevent WebDriver from locating a specific element. This is 
 * where JavaScriptExecutor comes into picture.
 * 
 * It is an Interface, it is a medium that enables the WebDriver to interact with HTML elements within the browser.
 * 
 * JavaScriptExecutor consists of two methods:
 * 
 * 1) executeScript method:  This method executes the test script in the context of the currently selected window or frame.The script in the method
 * runs as an anonymous function. For HTML element, the method returns a WebElement.
 * 
 * 2)executeAsyncScript method: This method executes the asynchronous piece of JavaScript on the current window or frame. An asynchronous script 
 * will be executed while the rest of the page continues parsing, which enhances responsiveness and application performance.
 */
public class ActionsWithClickAndSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
//		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		action.sendKeys(driver.findElement(By.id("input-firstname")), "John").perform();
		action.sendKeys(driver.findElement(By.id("input-lastname")), "Cena").perform();
		action.sendKeys(driver.findElement(By.id("input-email")), "john@gmail.com").perform();
		action.sendKeys(driver.findElement(By.id("input-telephone")), "123456789").perform();

		
	
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,350)", "");
		
		action.sendKeys(driver.findElement(By.id("input-password")), "test").perform();
		action.sendKeys(driver.findElement(By.id("input-confirm")), "test").perform();
		action.click(driver.findElement(By.xpath("//label[normalize-space()='Yes']"))).perform();
		action.click(driver.findElement(By.name("agree"))).perform();
		action.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();


	}

}
