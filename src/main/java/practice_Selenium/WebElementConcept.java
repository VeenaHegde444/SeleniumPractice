package practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*WebElement is a Interface. It represents an HTML element.
 * WebElement is an HTML(HyperText Markup Language) element on a website. 
 * title, url,back,forward,refresh are not web elements.
 * File,Edit etc are menu items, chrome browser items
 * 
 * Locator is a way to identify elements on a page.
 * FindElement & FindElements are from SearchContext Interface.
 * 
 * ChromeDevTools: It is a set of web developer tools built directly into the google chrome browser.
 * We have many panels in ChromeDevTools - Elements,Console,Sources,Network,Performance,Memory,Application,Security,Lighthouse,Recorder,
 * Performance Insights. The entire window is called ChromeDevTools.
 * 
 * Under ChromeDevTools,Elements tab will tell about html page , this html is called HTML DOM(Document Object Model) of a web page.
 * 
 * When we hit the url, first HTML DOM will be loaded, not the web page.
 * 
 * Chrome browser has some API's or some internal mechanism to read DOM. These are called DOM API's. These API's will be provided by browsers.
 * 
 * html tag : after < in DOM
 * keys are called attributes/web element properties:
 * attribute value:
 * a: anchor tag : this is html tag for all links
 * img: all images will be represented by img html tag
 * 
 * Register: it is a text of that particular element
 */
public class WebElementConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create webElement + perform action (click, sendKeys, getText, isDisplayed)

	}

}
