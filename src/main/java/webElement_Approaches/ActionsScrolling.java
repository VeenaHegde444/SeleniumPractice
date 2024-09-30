package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * Shortcut for scrolling: PgDn, 
 */
public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		
		//partial scrolling
		
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.PAGE_UP).perform();
		
		//Keys implements CharSequence
		//Keys is a enum, enum is a collection of multiple constant values
		
		//scroll to footer of the page
		action.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		//scroll to top of the page
		action.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		
		//scroll to element
		
		action.scrollToElement(driver.findElement(By.linkText("Community")))
		           .click(driver.findElement(By.linkText("Community")))
		               .perform();
		
		driver.quit();
		



	}

}
