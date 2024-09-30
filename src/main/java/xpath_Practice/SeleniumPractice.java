package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPractice {

	static WebDriver driver;

 	public static void main(String[] args) {
        driver = new FirefoxDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		
		//find all links
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total no. of links: "+totalLinks.size());
		
		//find all images
		List<WebElement> imagesCount = driver.findElements(By.xpath("//img"));
		System.out.println("Total no. of images: "+imagesCount.size());
		
		//find all text fields
		
		List<WebElement> textFields = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("Total no. of text fields: "+textFields.size());

		
		driver.quit();

	}

}
