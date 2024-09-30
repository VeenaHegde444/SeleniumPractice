package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiMenuHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		
//		By level1 = By.xpath("//span[text()='Shop by'])[2]");
//		By level1 = By.xpath("//span[text()='Category'][2]");
		
		By level1 = By.xpath("//*[@id=\"headlessui-menu-button-:R5bab6:\"]/div/span[1]");		
		By level2 = By.linkText("Fruits & Vegetables");
		By level3 = By.linkText("Fresh Fruits");
		By level4 = By.linkText("Banana, Sapota & Papaya");
		
		ParentChildMenu(level1,level2,level3,level4);

	}
	
	
	public static void ParentChildMenu(By level1,By level2,By level3,By level4) throws InterruptedException {
		getElement(level1).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level2)).perform();
		Thread.sleep(1000);
		action.moveToElement(getElement(level3)).perform();
		Thread.sleep(1000);
		getElement(level4).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
