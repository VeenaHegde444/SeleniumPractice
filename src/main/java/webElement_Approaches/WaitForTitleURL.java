package webElement_Approaches;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
//		driver.getTitle();//loading..checking...null
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		if(wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."))) {
//		//to check title of web page >> go to View Page Source >> copy Title
//		System.out.println(driver.getTitle());
//		}
		
//		try {
//			wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."));
//		}
//		catch(TimeoutException e) {
//			System.out.println("Title is not found");
//			
//		}
		
//		waitForTitle("Veena",10);
//		String title =getPageTitle("veena",10);
//		String title = getPageTitleIs("Free CRM software for customer relationship management, sales, and support.",5);
//		System.out.println(title);
		
		ElementUtil eUtil = new ElementUtil(driver);
		String url = eUtil.getPageURLContains("route=account/login", 5);
		System.out.println(url);

	}
	
	public static String getPageTitleIs(String expectedTitle, int timeOut) {
		if(waitForTitleIs(expectedTitle,timeOut)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
	
	public static String getPageTitleContains(String expectedTitle, int timeOut) {
		if(waitForTitleIs(expectedTitle,timeOut)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
	
	public static boolean waitForTitleIs(String expectedTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		boolean flag=false;
		try {
			return wait.until(ExpectedConditions.titleIs(expectedTitle));//if title is not matched, it will throw TimeoutException
		}
		catch(TimeoutException e) {
			System.out.println("Title is not matched");
			return flag;
		}
		
	}
	
	public static boolean waitForTitleContains(String fractionTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		boolean flag=false;
		try {
			return wait.until(ExpectedConditions.titleContains(fractionTitle));
		}
		catch(TimeoutException e) {
			System.out.println("Title is not matched");
			return flag;
		}
		
	}

}
