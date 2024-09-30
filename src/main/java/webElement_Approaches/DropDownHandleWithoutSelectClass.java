package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * get all the options using Select class and without Select class
 * select a country(India) 
 */
public class DropDownHandleWithoutSelectClass {
	
	static WebDriver driver;

 	public static void main(String[] args) {
        driver = new FirefoxDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
//		List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		
//		System.out.println(optionsList.size());
//		
//		for(WebElement e: optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		selectDropDownValue(countryOptions,"India");
		
	}
 	
 	public static void selectDropDownValue(By locator,String value) {
 		List<WebElement> optionsList = 	driver.findElements(locator);
 		
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
 	}

}
