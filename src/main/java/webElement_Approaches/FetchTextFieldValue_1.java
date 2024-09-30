package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue_1 {
        static WebDriver driver;            
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
//		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		
//		String text = driver.findElement(By.id("password")).getAttribute("value");
//		System.out.println(text);
		
		By emailId = By.id("email");
		By password = By.id("password");
		By hereLink = By.linkText("here");
		
		doSendKeys(emailId,"test@gmail.com");
		String v1 = doElementGetAttribute(emailId,"value");
		System.out.println(v1);
		
//		doSendKeys(password,"test@123");
		String v2 = doElementGetAttribute(password,"placeholder");
		System.out.println(v2);
		
		String hrefValue = doElementGetAttribute(hereLink,"href");
		System.out.println(hrefValue);
		

	}
	
	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
