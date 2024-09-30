package cssSelector_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class FindPrivacyPolicyLinkBeforeCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement checkBox = driver.findElement(By.name("agree"));
		WebElement continueBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		String policyText = driver.findElement(with(By.tagName("a")).toLeftOf(checkBox)).getText();
		System.out.println(policyText);
		
		String continueBtnText = driver.findElement(with(By.xpath("//input[@type='submit']")).toRightOf(checkBox)).getAttribute("value");
		System.out.println(continueBtnText);
		
		driver.quit();
			

	}

}
