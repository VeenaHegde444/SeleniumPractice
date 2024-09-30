package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintTextFields {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//input[@id='input-firstname']/preceding::label[@for='input-firstname']
		
//		String firstNameLabel = driver.findElement(By.xpath("//input[@id='input-firstname']/preceding::label[@for='input-firstname']")).getText();
//		System.out.println(firstNameLabel);
		
		//input[@id='input-lastname']/preceding::label[@for='input-lastname']
		
		
		//form[@class='form-horizontal']/fieldset[@id='account']/div
		//form[@class='form-horizontal']/fieldset[@id='account']/div/label[contains(@for,'input')]
		
		List<WebElement> personalDetailsLabel = driver.findElements(By.xpath("//form[@class='form-horizontal']/fieldset/div/label[contains(@for,'input')]"));
		
		for(WebElement e: personalDetailsLabel) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
		//form[@class='form-horizontal']/fieldset/div/label[contains(@for,'input')]
		driver.quit();

	}

}
