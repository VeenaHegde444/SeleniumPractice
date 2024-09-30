package cssSelector_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_Practice_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.hubspot.com/login");
		
		//in case of multiple classes
		//.c1.c2.c3
		
		driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		

	}

}
