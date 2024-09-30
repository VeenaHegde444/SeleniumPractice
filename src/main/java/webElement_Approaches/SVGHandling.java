package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		
		//find the search icon
		
		//SVG - Scalar Vector Graph
		//html tag <svg>
		//normal xpath never works with svg elements
		//we need a special xpath to find the svg elements
		// svg elements always starts with '//*[local-name()='svg']'
		//local-name() function is used for parent svg element
		
		//to find all svg elements in the DOM
//		driver.findElement(By.xpath("//*[local-name()='svg']"));
		
		// it should starts with local-name() function alonth with that we can add other attributes		
//		driver.findElement(By.xpath("//*[local-name()='svg' and @fill='none']"));
		
		
		driver.findElement(By.xpath("//form[contains(@class,'_2rslOn header-form-search')]//*[local-name()='svg' and @fill='none']")).click();
		driver.quit();
	}

}
