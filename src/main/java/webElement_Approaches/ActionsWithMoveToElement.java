package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithMoveToElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
//		By addOns = By.xpath("//div[text()='Add-ons']");
//		By visaServices = By.xpath("//div[text()='Visa Services']");
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(addOns)).perform();
//		Thread.sleep(1500);
//		driver.findElement(visaServices).click();
		
//		ParentChildMenu("Add-ons","Visa Services");
		
		By parentMenu = By.xpath("//div[text()='SpiceClub']");
		By childMenu = By.xpath("//div[text()='Benefits']");
		
		ParentChildMenu("SpiceClub","Benefits"); // we have to maintain the By locators to use 1st method

	}
	
	/**1st method:
	 * We can pass by locators
	 * @param parentMenu
	 * @param childMenu
	 * @throws InterruptedException
	 */
	public static void ParentChildMenu(By parentMenu,By childMenu) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		getElement(childMenu).click();
		
	}
	/**
	 * We can pass string.
	 * @param parentMenu
	 * @param childMenu
	 * @throws InterruptedException
	 */
	
	public static void ParentChildMenu(String parentMenu,String childMenu) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(By.xpath("//div[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(1500);
		getElement(By.xpath("//div[text()='"+childMenu+"']")).click();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
