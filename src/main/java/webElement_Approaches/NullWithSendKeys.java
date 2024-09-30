package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//is it possible to enter 'null' values using sendKeys() method?
		//Ans: No, we will get exception "IllegalArgumentException: Keys to send should be a not null CharSequence"
		
	//	driver.findElement(By.id("input-email")).sendKeys(null);
		
		//is it possible to send blank value using sendKeys() method?
		//Ans: Ideally it should throw an error as per the CharSequence Interface, but doesn't show any error, it doesn't enter anything
		//
		
		driver.findElement(By.id("input-email")).sendKeys("");
		


	}

}
