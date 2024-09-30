package webElement_Approaches;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * When switch from parent to child window, we need to provide window id.
 * Window ID is unique for each window.
 * 
 * Seleniumm treats window & tab in a same way.
 * 
 * How do we know when we click on some link it will open in the same page or opens a new window/tab?
 *Ans: In DOM, if we find 'target="_blank", then it opens in new window/tab. 
 *
 *Set is a non-order based Collection. It doesn't maintain duplicate values.
 *It has iterator() method.
 *
 *When we store the elements in Set, memory will be divided into 2 segments. In case of 2 windows, parentWindowID will be stored in 1st segment & 
 *childWindowID will be stored in 2nd segment.
 *Iterator() will be initially pointing just above the first segment.
 * 
 */
public class BrowserWindowHandlingConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		
		//target = "_blank" -- new window/tab
		
		//1. one parent & one child window handling
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
//		WebElement newsArticles = driver.findElement(By.xpath("//a[contains(text(),'News Articles')]"));
//		WebElement csSupport = driver.findElement(By.xpath("//a[contains(text(),'CS & Support')]"));
//		WebElement testimonials = driver.findElement(By.xpath("//a[contains(text(),'Testimonials')]"));
		
		
		//when we click directly showing exception,
		//ElementNotInteractableException: element not interactable
//		executiveProfile.click();//child window
		
	    //In case of ElementNotInteractableException we should use Actions class.
		
		Actions action = new Actions(driver);
		action.click(executiveProfile).perform();//child window

		
		//1.fetch the window ids for parent & child windows
		
		Set<String> handles = driver.getWindowHandles();
		//Set is a non-order based Collection. It doesn't maintain duplicate values.
		//When we store the elements in Set,memory will be divided into 2 segments.In case of 2 windows, parentWindowID will be stored in 1st segment
		//& childWindowID will be stored in 2nd segment.
		
		// iterator() method returns Iterator<String>
		//It returns an iterator over the elements in this list. The elements are returned in no particular order.
		//When we call iterator() method for the 1st time, it will be pointing just above the first segment i.e parentWindowID segment.
		Iterator<String> it = handles.iterator();
		
		//next() method returns String,it returns the next element in the iteration.
		//when we call next() method, it will point to childWindowID segment.
		//next() method will move to the next element & fetch the details
		String parentWindowID = it.next();
		System.out.println("parent window id: "+ parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child window id: "+childWindowID);
		
		
		//2.switch to child window
		//now driver is pointing to parent window. we need to use switchTo() method to switch to child window.
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window title: "+driver.getTitle());
		
		driver.close(); //it will close the child window
		//now driver is not pointing anywhere
		//in case of window or tab driver will not come back to parent window. We need to use switchTo() method.
		
		driver.switchTo().window(parentWindowID);//back to parent window
		System.out.println("parent window title: "+driver.getTitle());
		
		driver.quit();//quit the parent window
		
		}

}
