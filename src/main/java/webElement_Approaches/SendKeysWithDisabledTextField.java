package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisabledTextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//when we try to enter values in disabled field we will get exception
		//"ElementNotInteractableException: element not interactable"
//		driver.findElement(By.id("pass")).sendKeys("Veena");
		
		//try to click on disabled element, it will not throw any exception but it won't click on it
		
		driver.findElement(By.id("pass")).click();

	}

}
