package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {
	
	//SVG:
	
	//browser --> page -->iframe -->svg -->g -->path

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		//find all the states with their names
		
		//1.find all svg elements
		//*[local-name()='svg']
		
		//using index --not a good solution
	//	(//*[local-name()='svg'])[1] ---put it in a capture group & apply index
		
		//adding attribute
		//*[local-name()='svg' and @id='map-svg']
		
		//from above going to child elements --->
		//*[local-name()='svg'] : parent
		//*[name()='g'] : child
		
		//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']
		
		
		//getting list of all states
		
//		driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']"));
		
		//getting path
		
//		driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path'] "));
		
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']" ;
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		
		//getting total no. of elements
		System.out.println(statesList.size()); //0, because it is inside iframe
		
		//after switching to iframe getting InvalidSelectorException
		
		//we need to moveToElement to get the name of each state, we can handle with Actions class
		
		Actions action = new Actions(driver);
		for(WebElement e: statesList) {
			action.moveToElement(e).perform(); //MoveTargetOutOfBoundsException: move target out of bounds(ChromeDriver)
			//get the attribute value
			String nameAttr = e.getAttribute("name");
			System.out.println(nameAttr);
			if(nameAttr.contains("California")) {
				action.click(e).perform();
				break;
			}
			Thread.sleep(1000);
			
		}
		
		driver.quit();
		
		//SVG: special xpath
		//parent svg: local-name()
		//child svg: g,path : name()
		

	}

}
