package cssSelector_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFunctionForFooterLinks_Amazon {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println(getFooterLinks("Get to Know Us"));
		System.out.println(getFooterLinks("Make Money with Us"));
		System.out.println(getFooterLinks("Amazon Payment Products"));
		System.out.println(getFooterLinks("Let Us Help You"));
		
		driver.quit();
		

	}
	
	public static List<String> getFooterLinks(String columnHeader) {
		List<WebElement> footerLinksList = driver.findElements(By.xpath("//div[text()='"+columnHeader+"']/following-sibling::ul//a"));
		List<String> footerLinks = new ArrayList<String>();
		for(WebElement e:footerLinksList) {
			String text = e.getText();
			footerLinks.add(text);
		}
		return footerLinks;
	}

}
