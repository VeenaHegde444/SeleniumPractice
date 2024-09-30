package webElement_Approaches;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//approach 2: here we are clicking the link one by one & coming back to the parent window each time
public class Assignment_MultipleBrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		String parentWindowID = driver.getWindowHandle();
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		
		Actions action = new Actions(driver);
		
		WebElement[] links = {executiveProfile,newsArticles,csSupport,pressReleases};
		
		for(WebElement e: links) {		
		action.click(e).perform();
			
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			
			if(!windowID.equals(parentWindowID)) {
				System.out.println("Child window title: "+driver.getTitle());
				driver.close();			
			}
			
		}
		
		driver.switchTo().window(parentWindowID);
	 	Thread.sleep(1500);
	    }
		
		System.out.println("Parent window title: "+driver.getTitle());
		driver.quit();

	}

}
