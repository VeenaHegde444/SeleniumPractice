package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAndLastLink_NaveenAutomationLabs {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//all links from right panel
//		List<WebElement> rightPanelLinks = driver.findElements(By.xpath("//div[@class='list-group']//a"));
//		System.out.println(rightPanelLinks.size());
		
		//find the 1st link
		
	//	String firstLink = driver.findElement(By.xpath("(//div[@class='list-group']//a)[position = 1]")).getText();
	//	String firstLink = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']")).getText();
		String firstLink = driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Login']")).getText();
		System.out.println("First link from the right panel is: "+firstLink);
		
		//find the last link
		
	//	String lastLink = driver.findElement(By.xpath("(//div[@class='list-group']//a)[last()]")).getText();
		String lastLink = driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Newsletter']")).getText();
		System.out.println("Last link from the right panel is: "+lastLink);
		
		driver.quit();
		
//https://selectorshub.com/xpath-practice-page/
		//https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard
	}

}
