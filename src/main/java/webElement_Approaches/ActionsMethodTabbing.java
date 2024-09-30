package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
/*
 * Enum: It is a collection of multiple constant values.
 * Keys is a enum.
 * 
 * Tabbing is a accessibility testing.
 * 
 * Question: You are not allowed to use By locator & WebElement more than one time. Fill the registration form. 
 * By tabbing we can achieve.
 */
public class ActionsMethodTabbing {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		Actions action = new Actions(driver);
	    Action act = action.sendKeys(firstName, "Veena")
		         .sendKeys(Keys.TAB)
		            .pause(500)
		              .sendKeys("Hegde")
		                .sendKeys(Keys.TAB)
		                  .pause(500)
			               .sendKeys("veena@gmail.com")
			                .sendKeys(Keys.TAB)
			                  .pause(500)
				                .sendKeys("123456789")
				                  .sendKeys(Keys.TAB)
				                    .pause(500)
					                  .sendKeys("test@123")
					                    .sendKeys(Keys.TAB)
					                      .pause(500)					                      
						                    .sendKeys("test@123")
						                      .sendKeys(Keys.TAB)
						                        .pause(500)
							                      .sendKeys(Keys.TAB)
							                        .pause(500)
								                      .sendKeys(Keys.TAB)
								                        .pause(500)
									                        .sendKeys(Keys.SPACE)
									                           .pause(500)
									                               .sendKeys(Keys.TAB)
									                                  .pause(500)
									                                     .sendKeys(Keys.ENTER)
				                                                           .build();
				                                                             
		                   
		act.perform();
		driver.quit();
		

	}

}
