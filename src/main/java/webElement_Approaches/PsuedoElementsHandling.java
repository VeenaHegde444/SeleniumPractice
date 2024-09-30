package webElement_Approaches;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * css pseudo element is used to style specified parts of an element.
 */
public class PsuedoElementsHandling {

	public static void main(String[] args) {
		//:: before
		//:: after
		//:: has
		//these are called psuedo elements
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//verifying fields are mandatory or not
		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-firstname\\\"]'),'::before').getPropertyValue('content')";
		//it is javascript, return is mandatory, without return it gives NullPointerException
		
//		String script = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-firstname\\\"]'),'::before').getPropertyValue('color')";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content = js.executeScript(script).toString();
		System.out.println(content);
		
		if(content.contains("*")) {
			System.out.println("FirstName is mandatory field");
		}
		

		

	}

}
