package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.
		
		
		//Syntax: //htmltag[contains(text(),'value')]--helpful for long text, or paragraph
		driver.findElement(By.xpath("//p[contains(text(),'shop faster')]"));
		
		
		//contains() with attribute & no contains with text()
		//htmltag[contains(@attribute,'value') and text()='value']
		//a[contains(@href,'/wishlist') and text()='Wish List']---2
		
		
		//contains() with attribute & contains with text()
		//htmltag[contains(@attribute,'value') and contains(text()='value')]
		//a[contains(@href,'/wishlist') and contains(text(),'Wish List')]

	}

}
