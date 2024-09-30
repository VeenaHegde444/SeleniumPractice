package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * headless:
 * no browser activity
 * no browser is visible
 * testing is happening behind the scene
 * faster
 * When to use headless mode? Ans: when we want to run our test cases in cloud or jenkins
 * Cloud : linux machine,jenkins server(linux)
 * 
 * not recommended
 * 
 * chrome : ChromeOptions
 * firefox : FirefoxOptions
 * edge : EdgeOptions
 */
public class HeadlessConcept {

	public static void main(String[] args) {
		//ChromeOptions is a class, we need to create object of ChromeOptions
		ChromeOptions co = new ChromeOptions(); 
		co.addArguments("--headless"); //opening a white blank window, after browser updation
		
		//now creating ChromeDriver object we should pass ChromeOptions reference 		
		WebDriver driver = new ChromeDriver(co); // if we don't pass 'co' reference , it will open the browser
		
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless=new"); //129 version
//		WebDriver driver = new EdgeDriver(eo);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("title: "+driver.getTitle());
		
		driver.findElement(By.linkText("Register")).click();
		System.out.println("title: "+driver.getTitle());
		driver.quit();

	}

}
