package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//to print the value of what we are entering in the text field we should use getAttribute("value"). 
		//some times it will be hidden in DOM, still we can print it using value
		
		String text = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(text);

	}

}
