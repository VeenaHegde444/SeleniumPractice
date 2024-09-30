package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		//click on image
		driver.findElement(By.id("imageTemplateContainer")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Vehicle Registration");
		
		//element is inside the iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Vehicle Registration");
		
		//now try to print Vehicle Registration Form text
		
//		driver.findElement(By.xpath("//h3[text()='Vehicle Registration Form']")).getText();//NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//h3[text()='Vehicle Registration Form']"}
		
		//need to come out of iframe or come to main page
		//defaultContent() : selects either the first frame on the page or the main document when a page contains iframes
		
		driver.switchTo().defaultContent();
		
//		String header = driver.findElement(By.xpath("//h3[text()='Vehicle Registration Form']")).getText();
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);

	}

}
