package uiTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.BaseTest;

//we need to add below line to execute the script from here. But this works only for google.
//public void setUp(@Optional("https://www.google.com/") String url,@Optional("chrome") String browserName)
public class GoogleTest extends BaseTest{
	
	
	@Test
	public void pageTitleTest() {
//		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Google");
	}
	
	
	@Test
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("google"));
	}
	



}
