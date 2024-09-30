package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//interview question: very important
public class ActionsSendKeysWithPause {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
//		WebElement firstNameElement = driver.findElement(firstName);
//		
//		Actions action = new Actions(driver);
//		
//		String name = "Naveen Automation Labs";
//		char ch[] = name.toCharArray();//converts the string into character array
//		for (char c: ch) {
//			action.sendKeys(firstNameElement, String.valueOf(c)).pause(500).perform();//String.valueOf(c) will returns the string
//			//because in sendKeys method of Actions class we need to pass WebElement & CharSequence but 'c' is a character not a CharSequence
		//we need to convert char to string , so we should use String.valueOf(c)
		   //CharSequence is a Interface, classes which are implementing CharSequence are String,StringBuilder,StringBuffer
//		}
		
		doActionsSendKeysWithPause(firstName,"Naveen Automation Labs",500);

	}
	
	public static void doActionsSendKeysWithPause(By locator, String value, long pauseTime) {
		
		Actions action = new Actions(driver);
		char ch[] = value.toCharArray();
		for (char c: ch) {
			action.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
