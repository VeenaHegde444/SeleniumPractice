package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks_Amazon {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		//find all links from 'Let Us Help You' section of footer
		String lastColumnLinks = driver.findElement(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]")).getText();
		System.out.println("Last column links from footer section:\n"+lastColumnLinks);
				
		driver.quit();

	}

}
