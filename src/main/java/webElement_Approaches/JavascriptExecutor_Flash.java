package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Flash {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(2000);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		WebElement loginForm = driver.findElement(By.id("hs-login"));
		
		WebElement emailAddress = driver.findElement(By.id("username"));
		
		jsUtil.flash(loginForm);
		jsUtil.flash(emailAddress);

	}

}
