package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalNoOfLinks {

	public static void main(String[] args) {
		//single element - findElement
		//multiple elements - findElements - List<WebElement>
		
		//find the total no. of links in a web page & print the text of each link & ignore the blank text
		//find out the broken links
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//links will start with the html tag <a>, so we can find the total no. of links using the tagName 'a'
		//List is a Interface, it is a order based collection, so index will start from 0
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		int totalLinks = linksList.size();
		System.out.println("Total no. of links: " +totalLinks);
		
		//iterate through the list & print the text of each link
		//using for loop
/*		for(int i=0;i<totalLinks;i++) { // index will start from 0 so i=0; totalLinks will give the length of the list so i<totalLinks
			String text = linksList.get(i).getText();
			if(text.length() != 0) {
			System.out.println(i+" = "+text);// some links doesn't have text, so it is blank in console
		      }             
		}
*/			
		
		
		//using for each loop
			int count = 0;
		for(WebElement e:linksList ) {
			String text = e.getText();
			if(text.length() != 0) {
				System.out.println(count+"="+text);
			}
			count++;
		}

	}

}
