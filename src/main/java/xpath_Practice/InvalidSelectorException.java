package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidSelectorException {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//wrong xpath syntax
		driver.findElement(By.xpath("///input[@@@id='input-email12']"));//InvalidSelectorException: Given xpath expression "///input[@@@id='input-email12']" is invalid
		//The expression is not a legal expression
		

	}

}
