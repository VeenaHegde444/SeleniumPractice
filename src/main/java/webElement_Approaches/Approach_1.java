package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* 23/07/2024 video:
 * This is the worst approach. For every element, we are writing driver.findElement()
 * Sending too many requests to the server.
 * Doesn't provide re-usability.
 * 
 */
public class Approach_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//for findElement we have to provide By class object
		//By: it is a class. It has many static methods.
		//id : is a static method, so we can access it using className
		//sendKeys() is used to enter the values.
		
		//findElement will always return WebElement
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");

	}

}
