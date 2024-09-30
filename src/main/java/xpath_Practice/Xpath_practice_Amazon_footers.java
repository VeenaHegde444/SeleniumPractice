package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_Amazon_footers {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		//find 'Help' link is available on the Amazon.com page, it should be the last link under 'Let Us Help You'
		
		//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility']---4
		
//		(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]--1(Let Us Help You)
//				
//		(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a---7(all links under Let Us Help You)
		 
//		((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]--Help
		
//		String helpText = driver.findElement
//		(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]"))
//		.getText();
//		System.out.println(helpText);
		
		
		//print all links text of last column 'Let Us Help You'
		
//		(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a
		
		
//		List<WebElement> allLinks = driver.findElements
//		(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a"));
//		
//		for(WebElement e: allLinks) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		//find 'Careers' of first column 'Get To Know Us'
		
//		(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[1]//a[1]
		
//		String careersText = driver.findElement
//		(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[1]//a[1]"))
//		.getText();
//		
//		System.out.println(careersText);
		
		//find 'Amazon Currency Converter' 
		
//		((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[3]//a)[last()]
		
		String currencyText = driver.findElement
		(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[3]//a)[last()]"))
		.getText();
		
		System.out.println(currencyText);
		
		driver.quit();
		

	}

}
