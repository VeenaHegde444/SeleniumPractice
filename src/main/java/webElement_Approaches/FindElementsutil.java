package webElement_Approaches;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsutil {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By images = By.tagName("img"); 
		By links = By.tagName("a");
		
		List<WebElement> imagesList = getElements(images);
		List<WebElement> linksList = getElements(links);
		
		
		int imagesCount = getElementsCount(images);
		System.out.println("Total images:"+imagesCount);
		
		int linksCount = getElementsCount(links);
		System.out.println("Total links: "+linksCount);
		
		List<String> eleTextList = getElementsTextList(links);
			
		System.out.println(eleTextList.contains("About Us")); //contains() method will return boolean,true
		System.out.println(eleTextList.contains("Contact Us"));//true
		
		printElementList(links);
		

	}
	
	//to print the values
	public static void printElementList(By locator) {
		List<String> eleTextList = getElementsTextList(locator);
		for(String e:eleTextList ) {
			System.out.println(e);
		}
		
	}
	
	//to get the text of links
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);//getElements will give the List<WebElement> not String.
		List<String> eleTextList = new ArrayList<String>();//List is a Interface & ArrayList is a class, so it is top casting
		//we need to store the text, which will be string
		//create an empty arrayList which holds String values & return type will be List<String>
		
		for(WebElement e: eleList) {
			String eleText = e.getText();
			if(eleText.length() != 0) { // if the length is not equal to zero
				eleTextList.add(eleText);//we are adding the text to the empty ArrayList.
			}
		}
		return eleTextList; //return eleTextList which is List<String>
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
