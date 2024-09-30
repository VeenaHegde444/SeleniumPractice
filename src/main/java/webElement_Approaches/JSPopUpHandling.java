package webElement_Approaches;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Alerts are messages that pop-up on the screen & require user interaction such as click or enter data.
 * 
 * Pop-ups are separate windows on top of the main windows for displaying ads, login prompts. 
 * 
 * Can we handle random pop-ups?
 * When we load the page it comes after 2 mins, sometimes after 5 mins etc..
 * 
 * Ans: No, we can't handle random pop-ups using any automation tools. These are not predictable.
 * 
 * Selenium 4.x : HasAuthenticated() method
 */
public class JSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		// There are three types of JavaScript alerts:
		//1.alert : it has only single button OK 
		//2.confirm : it has  OK & Cancel buttons
		//3.prompt : only 1 text field is allowed, it has OK & Cancel buttons.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		//It is a JavaScript alert. alert is not part of html DOM. We can't find the elements on alert pop-ups.
//		//alert has only one button: OK
//		//To dismiss the alert from keyboard : press 'Esc'
//		//we can use switchTo() method to switch to alert pop-up. We can get the text of alert message.
		//when alert is accepted, driver will automatically comes back to the page
//		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		//Alert is an Interface.
//		//It has 4 methods : accept(),dismiss(),sendKeys(String keysToSend),String getText()
//		
////		alert.accept();//this will click on OK
//		alert.dismiss();//this will cancel the alert
		
		
		//2.confirm
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
////		alert.accept();// click on OK
//		alert.dismiss();//click on Cancel
//		
		
		//3.prompt
//		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.sendKeys("naveenautomationlabs"); // we can't see the value we entered in alert text box using sendKeys method.
//		Thread.sleep(3000);
////		alert.accept();// click on OK
//		alert.dismiss();
		
		
//In case of no JS pop-up on the page, we will get NoAlertPresentException: no such alert

		Alert alert = driver.switchTo().alert();

	}

}
