package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
	    driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> languageLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("Total no. of language links :"+languageLinks.size());
		
		for(WebElement e: languageLinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("ಕನ್ನಡ")) {
				e.click();
				break;
			}
		}

	}

}
