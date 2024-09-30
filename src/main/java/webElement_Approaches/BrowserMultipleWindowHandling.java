package webElement_Approaches;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//approach 1: here after clicking the 1st link, we are not coming back to the parent window instead we are clicking on the 2nd link & so on
public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		
		String parentWindowID = driver.getWindowHandle();
		
		//1. one parent & multiple child window handling
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		
		
		Actions action = new Actions(driver);
		action.click(executiveProfile).perform();
		action.click(newsArticles).perform();
		action.click(csSupport).perform();
		action.click(pressReleases).perform();
		
		//2.fetch the window id's
		
		Set<String> handles = driver.getWindowHandles();
		//here we have more than 1 child windows, since Set is a non-order based collection, there is no guarantee 1st segment has parentWindowID, 
		//& rest has childWindowID's , it can be in any oder
		Iterator<String> it = handles.iterator();
		//we need a while loop to iterate over the elements
		//hasNext() method returns true if the iteration has next elements else false.
//		while(it.hasNext()) {
//			String windowID = it.next();
//			driver.switchTo().window(windowID);
//			System.out.println(driver.getTitle());
//			driver.close();
//			Thread.sleep(1500);
//		}
		
		//problem with the above while loop is that, it will close the parent window along with the child windows
		//so we need to maintain parentWindowID using getWindowHandle() after launching the url & store it in a variable
		//we should put a if condition in while loop where windowID != parentWindowID then close the driver.
		
		
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			
			if(!windowID.equals(parentWindowID)) {
				driver.close();
			
			}
			Thread.sleep(1500);
		}
		
		//after completing the while loop, driver is not pointing anywhere, so we need to switch back to parent
		driver.switchTo().window(parentWindowID);//switching back to parent window
		System.out.println("parent window title: "+driver.getTitle());

	}

}
