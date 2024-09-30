package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		//locators in selenium
		//create web element(findElement) + perform action(click)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1.id: is an attribute: unique
//		driver.findElement(By.id("input-firstname")).sendKeys("Veena");
//		driver.findElement(By.id("input-lastname")).sendKeys("Hegde");
		
		//2.name: is an attribute, can be duplicate(clicks on 1st name)
//		driver.findElement(By.name("firstname")).sendKeys("Veena");
//		driver.findElement(By.name("lastname")).sendKeys("Hegde");
		
		//3.className: is an attribute, can be duplicate(clicks on 1st className)
//		driver.findElement(By.className("form-control")).sendKeys("Veena");
		
		//4.xpath: is not an attribute. It is the address of the web element in DOM.
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Veena");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Hegde");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
		//5.cssSelector: is not an attribute.
		//CSS-Cascaded Style Sheet
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Veena");
//		driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
		
		//6.linkText: only for links, but text can be duplicate(clicks on 1st link)
		//html tag: <a>
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partialLinkText: only for links
		//if there are multiple elements with the same text, it will click on 1st link
//		driver.findElement(By.partialLinkText("Forgotten Password")).click();
		
		//8. tagName:
		String header =	driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		if(header.equals("Register Account")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

	}

}
