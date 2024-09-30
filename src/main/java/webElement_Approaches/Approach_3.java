package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*This is also not a good approach.
 * We are maintaining WebElement in advance, if there are 50 elements are there in the web page, we have to write 50 times WebElement.
 * Every time we are sending request to server, unnecessary load on the server.
 * After that we are performing the action. What if we want only 10 elements, unnecessary we are maintaining 40 WebElements, unnecessary load
 * on the server.
 * Any action we will perform using driver, we are sending request to the server.
 * Using By locator we are not sending any request to the server.
 * 
 */
public class Approach_3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//using By locator
		
		//By is used to locate the element in a DOM.
		//here id returns a By, so we can store it in By class reference
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		
		//we can't perform action directly on By class, to perform the action we have to create WebElement, so we have to use findElement method
		WebElement email = driver.findElement(emailID); //here passing By class reference & storing it in WebElement
		WebElement pwd = driver.findElement(password);
		
		//using above WebElement reference, we can access .sendKeys() method
		email.sendKeys("test@gmail.com");
		pwd.sendKeys("test@123");

	}

}
