package practice_Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Difference between driver.get() & driver.navigate().to()
 * 
 * both are exactly same, both are synonyms of each other. 
 * both are used to launch a particular website url.
 * navigate.to() method will internally call .get() method
 * 
 * .get() method is not overloaded, it takes only String url
 * .navigate().to() method is overloaded, one method takes String url & other method takes URL url as a parameter (this is deprecated since "20")
 * 
 * .navigate() method has .back(),.forward(),.refresh(),.to(String url)
 * It doesn't track the browser history and all.
 * 
 * Difference:
 * .navigate() supports back(),forward(), refresh(), .get doesn't support.
 *  
 */
public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//back & forward browser simulation
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		
		
	//	driver.get("https://www.google.com/");
	//	driver.navigate().to("https://www.google.com/");
	//	driver.navigate().to(new URL("https://www.google.com")); //deprecated since "20"
		
		//this will reload the DOM of the web page, after refresh if we perform any action we will get error since the page as well as
		//web element got changed
		
	//	driver.navigate().refresh();

	}

}
