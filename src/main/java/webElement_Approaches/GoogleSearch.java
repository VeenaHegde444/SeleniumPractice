package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * Go to google, search with the item "selenium", print the suggestions and click on one suggestion.
 */
public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
/*		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		List<WebElement> suggestionList = driver.findElements(suggestions);
		
		System.out.println(suggestionList.size());
		
		for(WebElement e: suggestionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("training")) {
				e.click(); // here we have to click on web element, not on text
				break; // if we don't add the break statement we will get "StaleElementReferenceException", it will try to look for the next 
				//suggestion & fails, "either its node document is not the active document, or it is no longer connected to the DOM"
				//using break,it will click & comes out of the loop
			}
		}
*/
		
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		ElementUtil eUtil = new ElementUtil(driver);
	//	eUtil.doSearch(searchField, suggestions, "naveen automation labs", "training");//valid search
		eUtil.doSearch(searchField, suggestions, "acacacacacac", "training");//invalid search
	}
	
	public static void doSearch(By searchField, By suggestions,String searchKey,String matchValue) throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchKey);
		Thread.sleep(3000);
		
		List<WebElement> suggList = driver.findElements(suggestions);
		int totalSuggestions = suggList.size();
		System.out.println("Total no. of suggestions:" +totalSuggestions);
		
		for(WebElement e: suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(matchValue)) {
				e.click();
				break;
			}
		}
	}	
	
}
