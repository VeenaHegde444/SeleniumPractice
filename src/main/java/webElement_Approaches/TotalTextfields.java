package webElement_Approaches;
import java.util.List;

import org.openqa.selenium.By;
/*
 * Find how many text fields are present in the web page.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextfields {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//we should use the className since it is common to all the text fields.
		//since width, height, color are all same for these fields, they will be given common className.
		
		List<WebElement> textFieldList = driver.findElements(By.className("form-control"));
		System.out.println(textFieldList.size());
		
		//we should get the attribute value -placeholder
		for(WebElement e : textFieldList) {
			String text = e.getAttribute("placeholder");
			System.out.println(text);
		}

	}

}
