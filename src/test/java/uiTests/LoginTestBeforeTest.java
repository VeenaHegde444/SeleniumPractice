package uiTests;
/*
 * For test cases, we should always mention methodnameTest, so that it will be easier to debug.
 * 
 *We should not club everything in one test. For each scenario, we should create separate @Test method.
 *For one test, only one assertion should be mentioned.
 *
 *BeforeTest: browser will be opened only once. BeforeTest will be run only once.
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTestBeforeTest extends BaseTest{
	
    //here 'driver' we are getting from parent class
	
	@Test(priority=1)
	public void pageTitleTest() {
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	
	@Test(priority=2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test(priority=3)
	public void pageLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
	}
	

}
