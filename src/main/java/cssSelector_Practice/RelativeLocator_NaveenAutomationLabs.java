package cssSelector_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator_NaveenAutomationLabs {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailLabel  = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		WebElement passwordLabel  = driver.findElement(By.xpath("//input[@id='input-password']"));
		
//		driver.findElement(with(By.id("input-email")).below(label)).sendKeys("test@gmail.com");
		
		driver.findElement(with(By.id("input-email")).below(emailLabel).above(passwordLabel)).sendKeys("test@gmail.com");

	}

}
