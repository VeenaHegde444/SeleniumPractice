package xpath_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HubSpot {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.hubspot.com/login");

	}

}
