package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindFirstAndLastLink {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		//find the 1st link

		String firstLink = driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Login']")).getText();
		System.out.println("First link from the right panel is: "+firstLink);
		
		//find the last link
		

		String lastLink = driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Newsletter']")).getText();
		System.out.println("Last link from the right panel is: "+lastLink);
		
		driver.quit();

	}

}
