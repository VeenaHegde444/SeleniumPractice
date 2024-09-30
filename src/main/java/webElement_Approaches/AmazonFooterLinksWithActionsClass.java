package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonFooterLinksWithActionsClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		By footerLink = By.linkText("Help");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(footerLink)).perform();

	}

}
