package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//enter the wrong locator value
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");//NoSuchElementException: Unable to locate element
		//no such element: Unable to locate element: {"method":"css selector","selector":"#input\-email11"}

	}

}
