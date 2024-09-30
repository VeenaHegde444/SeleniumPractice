package webElement_Approaches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * JavascriptExecutor is an Interface. It is used to execute JS through selenium webdriver. It has a method executeScript.
 * RemoteWebDriver class implements JavascriptExecutor.
 * 
 * How many ways we can get pageTitke & pageUrl?
 * Ans: 2 ways, 1st using getTitle() & getCurrentUrl(), 2nd using JavascriptExecutor.
 * 
 * https://classic.crmpro.com/
 */
public class JavascriptExecutorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver(); //top casting
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//Interface casting:
//		JavascriptExecutor js = (JavascriptExecutor)driver; //casting
//		String pageTitle = js.executeScript("return document.title;").toString(); //return is mandatory here
//		System.out.println(pageTitle);
//		
//		String pageURL = js.executeScript("return document.URL;").toString();
//		System.out.println(pageURL);
		
//		getTitle();
//		getURL();
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		System.out.println(jsUtil.getPageTitle());
		System.out.println(jsUtil.getPageURL());
		
//		jsUtil.generateJsAlert("I am on the login page");
		
		String pageText = jsUtil.getPageInnerText();
		System.out.println(pageText);
		
		if(pageText.contains("OpenCart")) {
			System.out.println("PASS"); 
		}
		
		driver.quit();

	}
	
//	public static String getTitle() {
//		JavascriptExecutor js = (JavascriptExecutor)driver; 
//		String pageTitle = js.executeScript("return document.title;").toString();
//		return pageTitle;
//
//	}
//	
//	public static String getURL() {
//		JavascriptExecutor js = (JavascriptExecutor)driver; 
//		String pageURL = js.executeScript("return document.URL;").toString();
//		return pageURL;
//
//	}

}
