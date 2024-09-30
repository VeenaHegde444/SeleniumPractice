package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/*
 * Incognito:
 * It is a private window. 
 * It doesn't maintain the history.
 */
public class IncognitoConcept {

	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");		
//		WebDriver driver = new ChromeDriver(options);
		
//		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("--incognito");		
//		WebDriver driver = new FirefoxDriver(options);
		
		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--headless");
		options.addArguments("--Inprivate");		
		WebDriver driver = new EdgeDriver(options);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("title: "+driver.getTitle());
		
		driver.findElement(By.linkText("Register")).click();
		System.out.println("title: "+driver.getTitle());
		driver.quit();

	}

}
