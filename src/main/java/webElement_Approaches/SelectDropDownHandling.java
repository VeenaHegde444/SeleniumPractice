package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		// drop down -- htmltag : <select>
		//use Select class in Selenium
		//It works only for drop down with html tag as 'select'
		//select(parent)--option(child) : if we have a select:option combination we should use Select class
		//In Select class we can't pass By locator, we need to pass WebElement
		//
		
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		By country = By.id("Form_getForm_Country");
		WebElement countryElement = driver.findElement(country);
		
		//create the object of Select class & pass WebElement
		Select select = new Select(countryElement);
		
//		select.selectByVisibleText("India"); // enter the exact drop down value which is visible from the ui
//		select.selectByIndex(5); // we can use index only when drop down values are fixed & never change, ex: months in a year, days in a week
		//otherwise we should not use index, because if we add any new value, index will change
//		select.selectByValue("Argentina");//value available in DOM
		
		
//		selectDropDownValueByVisibleText(country,"India");
//		selectDropDownValueByIndex(country,5);
//		selectDropDownValueByValue(country,"Brazil");
		
//		List<WebElement> optionsList = select.getOptions();
//		System.out.println(optionsList.size());
		
		int count = getDropDownOptionsCount(country);
		System.out.println(count-1); // since country drop down contains 232 countries, 1st one is a Country, we can't add -1 in method
		//so while printing we can add

	}
	
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	public static void selectDropDownValueByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void selectDropDownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void selectDropDownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static WebElement getElement(By locator) { 
		return driver.findElement(locator);
	}

}
