package webElement_Approaches;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithPollingTime {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		By emailId = By.id("input-email11");//wrong by locator
		
		By emailId = By.id("input-email");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: input-email11 (tried for 10 second(s) with 500 milliseconds interval)
		//it will wait for 10 secs before showing TimeoutException, and default polling time is 500 milliseconds.
		
		//giving our own sleep interval
		//TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: input-email11 (tried for 10 second(s) with 2000 milliseconds interval)
		//now polling time is set to 2000 milliseconds
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@mail.com");
		
		By terms = By.linkText("Terms & Conditions");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.waitForElementAndClick(terms, 10);

	}

}
