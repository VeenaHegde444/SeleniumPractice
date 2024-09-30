package cssSelector_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindFooterLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> footerLinksList = driver.findElements(By.cssSelector("footer a"));
		for(WebElement e: footerLinksList) {
			String footerLinks = e.getText();
			System.out.println(footerLinks);
		}
		
		driver.quit();

	}

}
