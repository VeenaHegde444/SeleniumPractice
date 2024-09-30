package webElement_Approaches;
import java.util.List;

import org.openqa.selenium.By;
/*
 * Find the total no. of images in a web page.
 * 
 * Web scrapping: It is the process of using bots to extract content & data from a website. It is used for extracting data from websites.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//we can use the tagName="img" for images
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		int imagesCount = imagesList.size();
//		System.out.println("Total no. of images in a web page: "+imagesCount);
//		
		//		//for images, we can find the src attribute, since no other attributes are present
//		for(WebElement e: imagesList) {
//			String srcValue = e.getAttribute("src");
//			System.out.println(srcValue);
//		}
		
		
		//capture all links
		//print the link text & href values
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+linksList.size());
		
		for(WebElement e : linksList) {
			String text = e.getText();
			String hrefValue = e.getAttribute("href");
			System.out.println(text+" : "+hrefValue);
		}

	}

}
