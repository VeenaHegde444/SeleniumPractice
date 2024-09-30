package webElement_Approaches;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * ShadowDOM - these are light weight web elements, they are used to provide extra layer of security
 * 
 * shadow-rrot has to be in (open). If it is closed we can't automate.
 * 
 * ShadowDOM has its own DOM like iframe.
 * 
 * driver.findElement() method will not work on shadowDOM's.
 * 
 * We should use 'JSPath' to go to shadowDOM.
 * go to DOM >> inspect the element >> right click on the element >> Copy >> Copy JS Path >> go to Console >> clear >> paste >>enter
 * 
 * ShadowDOM works only with cssSelector , it doesn't work with xpath.
 * 
 * If the application is full of shadowDOM's then Selenium is not a good choice. Right tool for shadowDOM is Playright.
 */
public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		//driver.findElement doesn't work on shadowDOM element
//		driver.findElement(By.id("pizza")).sendKeys("Veg Pizza"); //NoSuchElementException: no such element: Unable to locate element:
		
		//go to DOM >> inspect the element >> right click on the element >> Copy >> Copy JS Path >> go to Console >> clear >> paste >>enter		
		// copy the document.querySelector entire thing ,this is the JSPath we need
		
		
		//Browser -->Page -->ShadowDOM -->input#pizza
		 String jsPath ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		 
		 JavascriptExecutor js	=(JavascriptExecutor)driver;		 
		 WebElement pizza =  (WebElement)js.executeScript(jsPath); //this will return the html element but we need WebElement
		 //so we need to cast it into WebElement
		 
		 pizza.sendKeys("Veg Pizza");
		 
		 //shadowDOM : xpath is not supported
		 //only css with JSPath
		 
		 
	
		

	}

}
