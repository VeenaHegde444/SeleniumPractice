package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_DrawBorder {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		
		WebElement registrationForm = driver.findElement(By.id("content"));
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Michelle");
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("M");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("michelle@gmail.com");
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("123456789");
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("test@123");
		WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
		passwordConfirm.sendKeys("test@123");
		
		jsUtil.drawBorder(registrationForm);
		jsUtil.drawBorder(firstName);
		jsUtil.drawBorder(lastName);
		jsUtil.drawBorder(email);
		jsUtil.drawBorder(telephone);
		jsUtil.drawBorder(password);
		jsUtil.drawBorder(passwordConfirm);

	}	

}
