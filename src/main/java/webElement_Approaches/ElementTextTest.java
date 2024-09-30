package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//to get the text from the web elements
		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgotPwdLink = By.linkText("Forgotten Password");
		By footerHeader = By.tagName("h5");
		
		ElementUtil eUtil = new ElementUtil(driver);
		String header1 = eUtil.doGetElementText(header);
		String para1 = eUtil.doGetElementText(para);
		String forgotPwdLink1 = eUtil.doGetElementText(forgotPwdLink);
		String footerHeader1 = eUtil.doGetElementText(footerHeader);
		
		System.out.println(header1);
		System.out.println(para1);
		System.out.println(forgotPwdLink1);
		System.out.println(footerHeader1);
		

	}

}
