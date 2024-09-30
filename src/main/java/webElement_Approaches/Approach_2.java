package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* This is also not a good approach. 
 * Though this provides the re-usability,we are writing driver.findElement() many times. 
 * In case, the web page has 50 elements then we have to write driver.findElement() 50 times.
 * 
 */
public class Approach_2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//findElement will be of type WebElement, so storing the below value in WebElement
		WebElement email_id = driver.findElement(By.id("input-email"));
		WebElement password =  driver.findElement(By.id("input-password"));
		
		email_id.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
	}

}
