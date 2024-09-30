package cssSelector_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_not_Amazon {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		//find footer elements using 'not'
		
		//div.navFooterVerticalRow.navAccessibility > div:not(div.navFooterColSpacerInner)---selecting columns with column headers 
		List<WebElement> footer = driver.findElements(By.cssSelector("div.navFooterVerticalRow.navAccessibility > div:not(div.navFooterColSpacerInner)"));
		
		for(WebElement e: footer) {
			String text = e.getText();
			System.out.println(text);
			
			
		}
		

	}

}
