package webElement_Approaches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * newWindow() feature has been added in Selenium 4.x
 */
public class NewWindowConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String parentWindowID = driver.getWindowHandle();
		
		
//		driver.switchTo().newWindow(WindowType.TAB);//it will open a blank TAB & switch to it as well
//		//newWindow() :creates a new browser window & switches the focus for future commands of this driver to the new window.
//		driver.get("https://www.flipkart.com/");
//		System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);//it will open a blank window & switch to it as well
		driver.get("https://www.amazon.com/");
		driver.close();
//		System.out.println("parent title: "+driver.getTitle());//NoSuchWindowException: no such window: target window already closed
		//after closing driver is not pointing anywhere
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent title: "+driver.getTitle());

	}

}
