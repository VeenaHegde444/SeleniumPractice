package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessInEdge {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		
		//https://github.com/SeleniumHQ/selenium/issues/14514
		options.addArguments("--headless"); //opening a white blank window, browser version 129
		options.addArguments("--window-position=-2400,-2400"); //temporary fix
		
		//edge -129 version
		WebDriver driver = new EdgeDriver(options);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("title: "+driver.getTitle());
		
		driver.findElement(By.linkText("Register")).click();
		System.out.println("title: "+driver.getTitle());
		driver.quit();
	}

}
