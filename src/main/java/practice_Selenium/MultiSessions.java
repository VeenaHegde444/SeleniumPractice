package practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSessions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//15de022eacf4e48f8d013715629bdba4
		driver=new ChromeDriver();//52d860fba2120eca7a8af26e92d349a1
		driver = new ChromeDriver();//8c19055953f2d578e4549c2dd788c3c0
		
		//how many browsers will be launched?
		//Ans: 3 chrome browsers with different session ID
/*		
		driver = new FirefoxDriver();
		//4 browsers will be launched
		
		//Which driver will be closed, one or all?
		//Ans: Firefox will be closed, because driver is pointing to Firefox
		//So, it will close only Firefox, chrome will be as it is 
		driver.quit(); 
		
		//if we try to get the title, we will get exception:"NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?" 
		driver.get("https://www.google.com");
		
*/		
		driver.get("https://www.google.com");
		driver.close();// 3rd chrome will be closed

	}

}
