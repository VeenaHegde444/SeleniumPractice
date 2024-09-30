package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		
		//1.Country dropdown
		
		//select[@id='Form_getForm_Country']
		//select[@id='Form_getForm_Country' and @name='Country']
		
		//Country dropdown all values
		//select[@id='Form_getForm_Country']/option---233
		//select[@id='Form_getForm_Country']/descendant::option              both are same
		
		
		//select[@id='Form_getForm_Country']/option[@value']---233
		
		
		//select single country
		//select[@id='Form_getForm_Country']/option[@value='Afghanistan']
		
		
		
		// double slash '//' - direct & indirect child elements - descendant child elements
		
	   //select[@id='Form_getForm_Country']/descendant::option");
		
	
		

	}

}
