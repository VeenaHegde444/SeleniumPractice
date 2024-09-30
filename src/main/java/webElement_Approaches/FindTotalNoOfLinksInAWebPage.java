package webElement_Approaches;
/*
 * Find the total no. of links in a web page. Find the count of links which are having text & without text.
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalNoOfLinksInAWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> totalLinksList = driver.findElements(By.tagName("a"));
		int totalLinks = totalLinksList.size();
		System.out.println("Total no. of links in a web page: "+totalLinks);
		
		int linksWithText = 0;
		int linksWithoutText = 0;
		
		for(int i=0;i<totalLinks;i++) {
			String text = totalLinksList.get(i).getText();
			System.out.println(i+" = "+text);
			if(text.length() != 0) {
				linksWithText++;
			}
			else {
				linksWithoutText++;
			}
			
		}
		System.out.println("Number of links without text: "+linksWithoutText);
		System.out.println("Number of links with text: "+linksWithText);
		
		driver.quit();
		


	}

}
