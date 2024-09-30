package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_capturegroup {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//indexing in xpath:
		
		//whenever we are getting multiple elements 1 of 2/3.. in DOM, we should use 'capture group' or 'collection group'
		//capture group means combine all of them together. then apply the index in square bracket.
		
		//Forgotten Password
		//a[text()='Forgotten Password']---2
		
	//	(//a[text()='Forgotten Password'])[1]
	//	(//a[text()='Forgotten Password'])[2]
		
		
		//whenever we have links with same text , we can use indexing
	//	driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[2]")).click();
		
		
		
		//E-Mail Address & Password there is no relationship--in that case if we want to go from E-Mail Address to Password, we should use 'following'
		
		//input[@id='input-email']/following::input--2
		
		//if we want to choose 1 out of 2 then we can give more info
		
		//input[@id='input-email']/following::input[@id='input-password']
		
		
		//if we want to go from Password to E-Mail Address, we should use 'preceding'
		
		//input[@id='input-password']/preceding::input[@id='input-email']
		
		
		//if we want to go from EMail-Address to 'E-Mail Address' label
		
		//input[@id='input-email']/preceding-sibling::label

	}

}
