package uiTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class NewUserRegistrationWithDataProvider extends BaseTest{
	
	@DataProvider
	public Object[][] getCreateData() {
		return new Object[][] {
			{"John","Doe","john.doe7@gmail.com","1234567890","test@123","test@123"}
		};
	}
	
	@Test(dataProvider="getCreateData")
	public void createNewUser(String firstName,String lastName,String email,String telephone,String password,String confirmPassword) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		
		String successMessage = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(successMessage);
		Assert.assertEquals(successMessage,"Your Account Has Been Created!" );
		
	}

}
