package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Scrolling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.scrollPageDown();
		
		//WebElement ele = driver.findElement(By.xpath("//h3[text()='Deals & Sales Pipeline']"));
	    WebElement ele	= driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		jsUtil.scrollIntoView(ele);
		
		jsUtil.scrollPageUp();
		jsUtil.scrollPageDown();

	}

}
