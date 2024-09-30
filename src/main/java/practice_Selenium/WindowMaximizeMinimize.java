package practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*fullscreen() : 
 * The browser's menu bar is not visible
 * The whole desktop estate is covered up by the browser
 * The task bar is not visible
 * 
 * maximize():
 * The browsers menu bar is visible
 * The whole desktop estate is not covered up by the browser
 * The task bar is visible
 */
public class WindowMaximizeMinimize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize the current window
	//	driver.manage().window().fullscreen(); // fullscreen the current window
		driver.manage().window().minimize();// to minimize current window
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		

		
		//viewport- testing for different window size
	}

}
