package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(3000);
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul/li//div[@class='YGcVZO _2VHNef']"));
		
		System.out.println(suggestionList.size());
		
		for(WebElement e: suggestionList) {
			String text = e.getText();
			System.out.println(text);
			
		}

	}

}
