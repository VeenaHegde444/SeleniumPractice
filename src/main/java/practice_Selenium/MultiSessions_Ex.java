package practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSessions_Ex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
	//	System.exit(1);
		driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
//		driver.close();// 3rd chrome will be closed

		

		driver.quit();
		driver.close();////NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
