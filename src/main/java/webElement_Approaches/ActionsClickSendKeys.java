package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By privacyPolicy = By.name("agree");
//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(firstName), "Veena").perform();
		
		doActionsSendKeys(firstName,"Veena");
		doActionsClick(privacyPolicy);

	}
	
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator),value).perform();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
