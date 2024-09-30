package uiTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest{
	
	
	@Test(priority=1)
	public void pageTitleTest() {
//		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | OrangeHRM");
	}
	
	
	@Test(priority=2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("30-day-free-trial"));
	}
	
	



}
