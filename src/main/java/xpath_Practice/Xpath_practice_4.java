package xpath_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_4 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		
		//find David Malan, capture the wicket taker---right side of web table
		
		//span[text()='Dawid Malan']/ancestor::td/following-sibling::td/span---if we use '//span' we will get 2 spans, 		
		//so use single slash & apply getText() method. When we apply getText() on /span i.e parent element, we will get both direct & indirect elements
		//or we will get both parent & child elements
		
//		String wicketTakerName = driver.findElement(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td/span")).getText();
//		System.out.println(wicketTakerName);
		
		System.out.println(getWicketTakerName("Dawid Malan"));
		System.out.println(getWicketTakerName("Sam Curran"));
		
		//print scorecard
		
		//span[text()='Dawid Malan']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
		
//		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
//		for(WebElement e: scoreList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		System.out.println(getPlayerScoreCard("Dawid Malan"));
		System.out.println(getPlayerScoreCard("Tom Curran"));
		
		
		
		//bowling scorecard
		
		//span[text()='Scott Currie']/ancestor::td/following-sibling::td
		
//		List<WebElement> bowlingCard = driver.findElements(By.xpath("//span[text()='Scott Currie']/ancestor::td/following-sibling::td"));
//		for(WebElement e: bowlingCard) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		System.out.println(getBowlingCard("Scott Currie"));
		
		driver.quit();

	}
	
	public static String getWicketTakerName(String playerName) {
		
		return driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td/span")).getText();
			
	}
	
	public static List<String> getPlayerScoreCard(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scoreCardList = new ArrayList<String>();
		for(WebElement e: scoreList) {
			String text = e.getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}
	
	public static List<String> getBowlingCard(String bowlerName) {
		List<WebElement> bowlingCard = driver.findElements(By.xpath("//span[text()='"+bowlerName+"']/ancestor::td/following-sibling::td"));
		List<String> bowlingCardList = new ArrayList<String>();
		for(WebElement e: bowlingCard) {
			String text = e.getText();
			bowlingCardList.add(text);
		}
		return bowlingCardList;
		
	}

}
