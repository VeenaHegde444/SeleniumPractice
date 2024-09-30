package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");//page
		Thread.sleep(3000);
		
		//frame: deprecated
		//iframe: according to W3C standards
		
//		String header = driver.findElement(By.tagName("h2")).getText();//NoSuchElementException: no such element: Unable to locate element: {"method":"tag name","selector":"h2"}
//		System.out.println(header);
		
		//in case of NoSuchElementException, first we need to check whether the element is inside the frame or iframe.
		//in above case, element is inside frame.
		//here first we need to switchTo() frame
		
		
		//frame() method is overloaded: it takes frame(int index), frame(String name), frame(WebElement frameElement)
		//1.By index
//		driver.switchTo().frame(2);//frame index starts from 0
		
		//2.By name
//		driver.switchTo().frame("main");
		
		//3.By WebELement
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		driver.quit();

	}

}
