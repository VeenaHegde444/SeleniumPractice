package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* Using sendKeys() we can send CharSequence...keysToSend (... represents an array). 
 * CharSequence implements String,StringBuilder,StringBuffer
 * We usually send string values in .sendKeys() method.
 * Use case: If we want to send address details with comma separated we can use .sendKeys() method.
 */
public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		//CharSequence--It is an Interface. It takes below :
		   //String
		   //StringBuffer
		   //StringBuilder
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		String firstName = "Veena";
//		StringBuilder lastName = new StringBuilder("Hegde");
//		StringBuffer city = new StringBuffer("Bengaluru");
//		
//		driver.findElement(By.id("input-email")).sendKeys(firstName," ",lastName," ",city);
		
		String firstName = "Veena";
		StringBuilder lastName = new StringBuilder("Hegde");
		StringBuffer city = new StringBuffer("Bengaluru");
//		String country = null;
		
//		driver.findElement(By.id("input-email")).sendKeys(firstName," ",lastName," ",city," ",country);
		//IllegalArgumentException: Keys to send should be a not null CharSequence

	}

}
