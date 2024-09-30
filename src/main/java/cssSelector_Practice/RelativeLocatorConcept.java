package cssSelector_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		//applicable from Selenium 4.x

//		       above
//		         |
//		left <- ele -> right
//		         |
//near	       below

		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
		//Most Polluted Cities in Canada
		//to use Relative locators we should manually write 'import static org.openqa.selenium.support.locators.RelativeLocator.with;'
		
		//first we need to create center element
		//with(): it is a method, it is a static method, we have to provide By locator
		WebElement ele = driver.findElement(By.linkText("Grande Prairie, Canada"));
		
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);
		
		String aqi = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqi);
		
		//if we apply findElement on parent i.e 'p', we can capture text of child
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String belowCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(belowCity);
		
		// for nearest element what is the distance?
		//Ans: CLOSE_IN_PIXELS = 50
		//distance between 2 elements in the web page will always be in pixels.
		
		
		String near = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);
		
		String nearLink = driver.findElement(with(By.tagName("a")).near(ele)).getText();
		System.out.println(nearLink);//will pick above element
		
	}

}
