package cssSelector_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_not {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//input.form-control:not(input[name='search'])
		
		driver.findElement(By.cssSelector("input.form-control:not(input[name='search']):not(input#input-password)")).sendKeys("test@gmail.com");
		
		//driver.quit();

	}

}
