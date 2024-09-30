package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoSuchElementException {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//wrong className, syntax is correct
//		driver.findElement(By.className("img-responsive11"));//NoSuchElementException: Unable to locate element
		
		
		//wrong xpath, syntax is correct
		
		driver.findElement(By.xpath("//input[@id='input-email12']"));//NoSuchElementException: Unable to locate element

	}

}
