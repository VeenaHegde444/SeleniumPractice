package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidSelector_CompoundClassNamesNotAccepted {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//multiple classes are not allowed with className(classNames separated with space), only single className is allowed
		//we can use multiple classes with xpath
		driver.findElement(By.className("form-control input-lg")).sendKeys("MacBook");//InvalidSelectorException: Compound class names not permitted

	}

}
