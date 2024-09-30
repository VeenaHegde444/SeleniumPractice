package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForFrame {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		By frameLocator = By.name("main");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.waitForFrameUsingLocatorAndSwitchToIt(frameLocator, 5);
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

}
