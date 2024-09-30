package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * Difference between findElement & findElements
 * 1.findElement will be applicable for single web element.
 * 1.findElements will be applicable for multiple web elements.
 * 
 * 2.findElement it will throw an exception 'NoSuchElementException' in case of element not found
 * 2.findElements will not throw any exception, it will just return empty list 
 */
public class ElementExceptionWithFEAndFEs {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive11");
	//	driver.findElement(logo).click(); //NoSuchElementException
		
		List<WebElement> logos = driver.findElements(logo); //empty list
		System.out.println(logos.size());//

	}

}
