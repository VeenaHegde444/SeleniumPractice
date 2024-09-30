package cssSelector_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllOptionValuesUsingCss {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		List<WebElement> countryList = driver.findElements(By.cssSelector("select#Form_getForm_Country > option"));
		for(WebElement e:countryList) {
			String countryNamesList = e.getText();
			System.out.println(countryNamesList);
		}
		
		driver.quit();

	}

}
