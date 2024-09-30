package webElement_Approaches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_VehicleRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();//browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//click on image
		driver.findElement(By.id("imageTemplateContainer")).click();
		Thread.sleep(3000);
		
		//switch to frame		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Four Wheeler Registration");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("New York");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("08/23/2024");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("New vehicle registration");
		
		WebElement chooseFile = driver.findElement(By.id("RESULT_FileUpload-6"));
		chooseFile.sendKeys("C:\\Users\\aksha\\Desktop\\Text.txt");
		
		//Contact Information
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("John");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Doe");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("13th Street");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("47W");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("New York");
		
		List<WebElement> stateList = driver.findElements(By.xpath("//select[@id='RESULT_RadioButton-13']/option"));
		for(WebElement e: stateList) {
			String text = e.getText();
			if(text.equals("New York")) {
				e.click();
				break;
			}
		}
		
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("10011");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("(212) 111-1234");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("john.doe@gmail.com");
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("FSsubmit")).click();
		Thread.sleep(1000);

		
		String successTitle = driver.findElement(By.cssSelector("h1.success-title")).getText();
		if(successTitle.equals("Thank you!")) {
			System.out.println("PASS: " + successTitle);
		}
		else {
			System.out.println("FAIL");
		}
		
		
		String successText = driver.findElement(By.cssSelector("h3.success-text")).getText();
		if(successText.equals("You have just successfully completed a Formsite form.")) {
		System.out.println("PASS: " +successText);
		}
		else {
			System.out.println("FAIL");
		}
		
		driver.quit();

	}

}
