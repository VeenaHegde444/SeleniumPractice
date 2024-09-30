package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	    static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//image is displayed in the page or not
		
		//how to check className is unique or single on DOM?
		//go to DOM >> Ctrl+F >> type  .className (put . before the className) >> 1 of 1 means single name
		
//		boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
		
		//wrong locator value
//		boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(flag);//true
//		
//		if(flag) {
//			System.out.println("logo is present");
//		}
//		else {
//			System.out.println("logo is not present");
//		}
		
		By logo = By.className("img-responsive");
//		boolean flag = isElementDisplayed(logo);
//		System.out.println(flag);
		if(isElementDisplayed(logo)) {
			System.out.println("logo is present");
		}
		else {
			System.out.println("logo is not present");
		}

	}
	
	public static boolean isElementDisplayed(By locator) {
		try {
		return getElement(locator).isDisplayed();
		}
		catch(NoSuchElementException e) { //import selenium exception
			System.out.println("Element is not displayed: "+locator);
			return false;
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
