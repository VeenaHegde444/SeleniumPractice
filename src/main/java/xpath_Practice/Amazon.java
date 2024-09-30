package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		//find all links from 'Get to Know Us' section of footer
		
//		String firstColumnValues = driver.findElement(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[1]")).getText();
//		System.out.println(firstColumnValues);
		
		//find 'Careers' from 'Get to know Us' section
		
//		String careerText = driver.findElement(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[1]//a")).getText();
//		System.out.println(careerText);
		
		
		//find all links from 'Make Money with Us' section of footer
//		String secondColumnValues = driver.findElement(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[2]")).getText();
//		System.out.println(secondColumnValues);	
		
		
		//find all links from 'Amazon Payment Products' section of footer
//		String thirdColumnValues = driver.findElement(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[3]")).getText();
//		System.out.println(thirdColumnValues);			
		
		//find all links from 'Let Us Help You' section of footer
//		String lastColumnValues = driver.findElement(By.xpath("(//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]")).getText();
//		System.out.println(lastColumnValues);
	    
		//find 'Help' from footer section
//		String helpText = driver.findElement(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
//		System.out.println(helpText);
		
		//find 'Manage Your Content and Devices' from footer section
		String manageContentText = driver.findElement(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]")).getText();
		System.out.println(manageContentText);
	    
	    driver.quit();
		

	}

}
