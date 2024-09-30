package xpath_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_XpathAxes {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("https://app.hubspot.com/login");
		
		//Xpath Axes:
		
		//child to immediate parent also called backward traversing in DOM: we should use '/..'
		//OR
		//we can use parent::htmltag
		
		//Email address : from child(input) to immediate parent(div)
		
		//input[@id='username']/..             --immediate parent
		//input[@id='username']/parent::div    --immediate parent    (it is more readable)
		
		
		//moving from input(child) to form(grand parent)
		//input[@id='username']/ancestor::form   --child to grand parent
		
		
		//input[@name='firstname']/ancestor::div[@id='content']---Registration form(https://naveenautomationlabs.com/opencart/index.php?route=account/register)
		
		
		
		
		

	}

}
