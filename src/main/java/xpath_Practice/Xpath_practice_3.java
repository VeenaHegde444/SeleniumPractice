package xpath_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_3 {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//web table :xpath axes-parent,child,sibling,ancestor,
		
		//select the check box in Users Table for a single user
		//in web table position is not fixed.
		
		//parent & child
		//table[@id='resultTable']//input-----parent is 'table' & 'input' is child
		
		//parent to direct child :  single slash / -- it will give direct elements
		//parent to indirect child: double slash //--it will give both direct & indirect elements. So elements count will be more.
		
		//child to immediate parent :  /.. (It is also called backward traversing in the DOM)(https://app.hubspot.com/login--from input(child) to form).
		//input[@id='username']/../../../../..
		
		
		//child to indirect parent(ancestor) : 
		
		//input[@id='username']/..             --immediate parent
		//input[@id='username']/parent::div    --immediate parent    (it is more readable)
				
				
		//moving from input(child) to form(grand parent)
		//input[@id='username']/ancestor::form   --child to grand parent
				
				
		//input[@name='firstname']/ancestor::div[@id='content']---Registration form(https://naveenautomationlabs.com/opencart/index.php?route=account/register)
		
		
		
		//Users Table
		//click on check box before Joe.Root( inspect Joe.Root then move to left side to select the check box)
		
		//xpath for Joe.Root
		//a[text()='Joe.Root']
		
		//moving from one sibling to another sibling ( one sibling is coming before another sibling is called 'preceding-sibling')
		//preceding-sibling::htmltag ( backward)
		//following-sibling::htmltag (forward)
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input   (checkbox before Joe.Root)
		
		//1st approach( go to immediate parent >>  preceding-sibling >> input
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//		
//		//select another user
//		
//		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		
		//2nd approach ( go to ancestor tr >> input)
		
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		selectCheckBox("Joe.Root");
		selectCheckBox("John.Smith");
		selectCheckBox("Garry.White");
		
		
		//print other information of 'Joe.Root'
		//from Joe.Root, we need to go to right side to pick all details of Joe.Root
		
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		
//		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		for(WebElement e: userDetails) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		System.out.println(getUserDetails("Joe.Root"));
		System.out.println(getUserDetails("Garry.White"));
		
		driver.quit();
		
	}
	
	//application dependent utility
	public static void selectCheckBox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//when append with single quote, we should concatenate "+string+", in xpath name should be in single quote
	}
	
	
	public static List<String> getUserDetails(String userName) {
		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userDetailsList = new ArrayList<String>();
		for(WebElement e: userDetails) {
			String text = e.getText();
			userDetailsList.add(text);		
		}
		return userDetailsList;
		
	}

}
