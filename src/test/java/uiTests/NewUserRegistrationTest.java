package uiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class NewUserRegistrationTest extends BaseTest{
	
	
	@Test(priority=1)
	public void pageTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Register Account");
	}
	
	@Test(priority=2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/register"));
	}
	
	@Test(priority=3)
	public void createNewUserTest() {
		driver.findElement(By.id("input-firstname")).sendKeys("John");
		driver.findElement(By.id("input-lastname")).sendKeys("Doe");
		driver.findElement(By.id("input-email")).sendKeys("john.doe6@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.id("input-confirm")).sendKeys("test@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		
		String successMessage = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(successMessage);
		Assert.assertEquals(successMessage,"Your Account Has Been Created!" );
		
	}

}
