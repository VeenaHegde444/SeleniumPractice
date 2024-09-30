package cssSelector_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindEvenAndOddElementsUsingCss {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//find even & odd elements using css
		
		List<WebElement> countriesAtOddIndex = driver.findElements(By.cssSelector("select#Form_getForm_Country > option:nth-child(odd)"));
		for(WebElement e:countriesAtOddIndex ) {
			String text = e.getText();
			System.out.println(text);
		}
		
		System.out.println("*******************************");
		List<WebElement> countriesAtEvenIndex = driver.findElements(By.cssSelector("select#Form_getForm_Country > option:nth-child(even)"));
		for(WebElement e:countriesAtEvenIndex ) {
			String text = e.getText();
			System.out.println(text);
		}
		
		driver.quit();

	}

}
