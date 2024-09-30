package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	List<WebElement> footerLinksList = driver.findElements(By.xpath("//footer/div/div//a"));//OpenCart is not included
		List<WebElement> footerLinksList = driver.findElements(By.xpath("//footer//a"));
		System.out.println("Total no. of links in the footer section:" +footerLinksList.size());
		
		for(WebElement e: footerLinksList) {
			String text = e.getText();
			System.out.println(text);
		}
				
		driver.quit();

	}

}
