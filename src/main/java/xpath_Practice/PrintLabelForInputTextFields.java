package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintLabelForInputTextFields {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> personalDetailsLabel = driver.findElements(By.xpath("//form[@class='form-horizontal']/fieldset/div/label[contains(@for,'input')]"));
		
		for(WebElement e: personalDetailsLabel) {
			String text = e.getText();
			System.out.println(text);
		}
		
		driver.quit();

	}

}
