package xpath_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaveenAutomationLabs {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// Search : absolute xpath
		
//	  By search = By.xpath("/html/body/header/div/div/div[2]/div/input");
	
	
	   // Search : relative xpath
	  // //htmltag[@attribute='value']
	  
	  By searchButton = By.xpath("//input[@name='search']");
	  
	  
	  //find all the elements in the LoginPage using relative xpath 
	  
	  By image = By.xpath("//img"); // using this //img it will find all the images from the web page.
	  By search = By.xpath("//input[@name='search']");
	  By searchIcon = By.xpath("//span[@class='input-group-btn']");
	  By homeIcon = By.xpath("//ul[@class='breadcrumb']/li[1]");
	  By Account = By.xpath("//ul[@class='breadcrumb']/li[2]");
	  By Login = By.xpath("//ul[@class='breadcrumb']/li[3]");
	  By newCustomerText = By.xpath("//h2[text()='New Customer']");
	  By registerAccountText = By.xpath("");
	  By continueButton = By.xpath("//a[text()='Continue']");
	  By returningCustomerText = By.xpath("//h2[text()='Returning Customer']");
	  By emailAddress = By.xpath("//input[@id='input-email']");
	  By password = By.xpath("input-password");
//	  By forgottenPassword = By.xpath("//a[text()='Forgotten Password']");//--2 
	  By loginButton = By.xpath("//input[@type='submit']");
	  
	  By allLinks = By.xpath("//a");
	  By allImages = By.xpath("img");
	  
	 
	  //find all the links with href value
	  
	List<WebElement> totalLinks =  driver.findElements(By.xpath("//a[@href]"));
	System.out.println("Total no. of links: "+totalLinks.size());

	}

}
