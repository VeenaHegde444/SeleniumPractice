package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//for file upload, type=file mandatory in DOM
		//if not present, below code doesn't work. Because Selenium will look for file=type
		//can ask the developer to add it in the DOM
		
		WebElement chooseFile = driver.findElement(By.name("upfile")); //don't click
		//In case of file upload don't click on it, because OS window will open to choose the file that can't be automated
		
		chooseFile.sendKeys("C:\\Users\\aksha\\Desktop\\Text.txt");

	}

}
