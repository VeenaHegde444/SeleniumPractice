package cssSelector_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class FillRegistrationFormUsingRelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstNameLabel = driver.findElement(By.xpath("//label[text()='First Name']"));
		WebElement lastNameLabel = driver.findElement(By.xpath("//label[text()='Last Name']"));
		WebElement emailLabel = driver.findElement(By.xpath("//label[text()='E-Mail']"));
		WebElement telephoneLabel = driver.findElement(By.xpath("//label[text()='Telephone']"));
		WebElement passwordLabel = driver.findElement(By.xpath("//label[text()='Password']"));
		WebElement confirmPasswordLabel = driver.findElement(By.xpath("//label[text()='Password Confirm']"));
		
		driver.findElement(with(By.id("input-firstname")).toRightOf(firstNameLabel)).sendKeys("John");
		driver.findElement(with(By.id("input-lastname")).toRightOf(lastNameLabel)).sendKeys("Doe");
		driver.findElement(with(By.id("input-email")).toRightOf(emailLabel)).sendKeys("john@gmail.com");
		driver.findElement(with(By.id("input-telephone")).toRightOf(telephoneLabel)).sendKeys("123 456 789");
		driver.findElement(with(By.id("input-password")).toRightOf(passwordLabel)).sendKeys("test@123");
		driver.findElement(with(By.id("input-confirm")).toRightOf(confirmPasswordLabel)).sendKeys("test@123");
		
		driver.quit();
		//1.26.57

	}

}
