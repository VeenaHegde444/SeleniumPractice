package xpath_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricInfoBowlingCardWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");

		System.out.println(getBowlingCard("Fazalhaq Farooqi"));
		System.out.println(getBowlingCard("Tom Hartley"));
		
		driver.quit();

	}
	
	public static List<String> getBowlingCard(String bowlerName) {
		
		List<WebElement> bowlingList = driver.findElements(By.xpath("//span[text()='"+bowlerName+"']/ancestor::td/following-sibling::td"));
		List<String> bowlingCardList = new ArrayList<String>();
		
		for(WebElement e: bowlingList) {
			String text = e.getText();
			bowlingCardList.add(text);
		}
		return bowlingCardList;
		
	}
	
}
