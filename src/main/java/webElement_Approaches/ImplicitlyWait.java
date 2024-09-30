package webElement_Approaches;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * ImplicitlyWait is a global wait.It is a built-in automatic wait.
 * 
 * It will be applied on all the web elements by default.
 * 
 * If an implicit wait is set, the driver will wait for the duration of the provided value before returning an error.
 * 
 * This is a global setting that applies to every element location call for the entire session. The default value is 0, which means that if the element
 * is not found, it will immediately return an error. If an implicit wait is set, the driver will wait for the duration of the provided value before 
 * returning the error. Note that as soon as the element is located, the driver will return the element reference and the code will continue executing, 
 * so a larger implicit wait value won’t necessarily increase the duration of the session.
 * 
 * Do not mix implicit and explicit waits. Doing so can cause unpredictable wait times. For example, setting an implicit wait of 10 seconds and an 
 * explicit wait of 15 seconds could cause a timeout to occur after 20 seconds.
 */
public class ImplicitlyWait {
	
	//global wait
	//it will be applied on all the web elements by default
	//it can't be applied for specific web elements
	//it can't be applied for non-web elements : title, url, windows, JS pop-ups

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Selenium 3.x, this method has been deprecated
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Selenium 4.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Duration is a class
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("veena@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
