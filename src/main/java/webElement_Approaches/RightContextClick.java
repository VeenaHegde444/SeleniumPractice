package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Right click & Context click both are same.
//We don't have right click option, we have to use 'contextClick'.
//For contextClick we have to give WebElement.

public class RightContextClick {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
//		Actions action = new Actions(driver);
//		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
//		By rightClickMe = By.xpath("//span[text()='right click me']");
//		By quitLink = By.xpath("//span[text()='Quit']");
		
		
		//after right click , click on 'Quit'
		
//		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		
		// capture all the options after right click
		
//		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list span"));
//		for(WebElement e:optionsList ) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
		
		doActionsRightClick("right click me","Quit");
		driver.quit();

	}
	
	public static void doActionsRightClick(String text,String rightClickOptions) {
		
		Actions action = new Actions(driver);
		action.contextClick(getElement(By.xpath("//span[text()='"+text+"']"))).perform();
		getElement(By.xpath("//span[text()='"+rightClickOptions+"']")).click();		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
