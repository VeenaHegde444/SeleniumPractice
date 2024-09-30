package cssSelector_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_comma {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.hubspot.com/login");
		
		//for quick sanity test
		int loginPageLementCount = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
		System.out.println(loginPageLementCount);
		
		if(loginPageLementCount == 4) {
			System.out.println("all 4 elements are present--PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		driver.quit();
	}

}
