package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		
//		boolean f1 = driver.findElement(By.id("fname")).isDisplayed();
//		System.out.println(f1);//true
//		
//		boolean f2 = driver.findElement(By.id("fname")).isEnabled();
//		System.out.println(f2);//true
//		
//		//disabled field
//		
//		
//		boolean f3 = driver.findElement(By.id("pass")).isDisplayed();
//		System.out.println(f3);//true
//		
//		boolean f4 = driver.findElement(By.id("pass")).isEnabled();
//		System.out.println(f4);//false
//		
		
		//isSelected:- input: checkbox,dropdown,radiobutton
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		boolean b1 = driver.findElement(By.name("agree")).isSelected();
		System.out.println(b1);//false
		
		driver.findElement(By.name("agree")).click();
		boolean b2 = driver.findElement(By.name("agree")).isSelected();
		System.out.println(b2);//true
		

	}

}
