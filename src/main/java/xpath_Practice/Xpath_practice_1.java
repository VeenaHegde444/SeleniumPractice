package xpath_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.hubspot.com/login");
		
		//find all the elements using relative xpath
		//relative xpth starts from  double slash '//'
		//we should always look for 1 of 1 in DOM
		//'or' is a bad approach for a single element
		//'and' is required when we have one common attribute,& we need to separate 
		
		/*
		 * Syntax :
		 * 
		  //htmltag[@attribute='value'] ---for single attribute
		 //htmltag[@attri1='value' and @attri2='value'] -- for two attributes
		  
		  
		  text based elements: for links, text fields etc
		  Use text() as a function.
		  
		  Syntax: 
		  
		  //htmltag[text()='value']
		  
		  
		 * 
		 */
		
		
		//Don't have an account?		
		//i18n-string[@data-key='login.signupLink.text']
		
		
		//Get started free
		//i18n-string[@data-key='login.signupLink.cta']
		
		
		//1.Email address 
		
		//using single attribute
		
		//input[@id='username']
		//input[@type='email']
		
		//using two attributes
		
		//input[@id='username' and @type='email']
		
		
		
		//2.Password
			
		//input[@id='password']
		//input[@type='password']
		//input[@id='password' and @type='password']
		
		
		//3.Show Password : It has only text, we should use text() function here. If we don't have any attribute, & only text is available
		//then we should use text() function. We have to pass the exact text, we can't pass partial text.
		
		//Syntax: //htmltag[text()='value']
		
		//span[text()='Show Password']
		
		
		
		//4.Forgot my password
		
		//Syntax: //htmltag[text()='value']
		
		//i18n-string[text()='Forgot my password']
		
		
		
		
		//5.Checkbox before Remember me
		
		//Syntax: //htmltag[@attribute='value']
		
		//span[@id='checkbox-content-4']
		
		
		
		//6.Remember me
		
		//Syntax: //htmltag[text()='value']
		
		//i18n-string[text()='Remember me']
		
		
		
		
		//7.Log in
		
		//Syntax: //htmltag[text()='value']
		
		//button[@id='loginBtn']
		
		
		//find how many links are available on the page		
		//a ---9
		
		//find all links with href property
		//a[@href]---4
		//a[not@href]---0
		
		//driver.findElements(By.xpath("//a")); with xpath, we can check links with href values(//a[@href]) or not href values (//a[not@href])
		//driver.findElements(By.tagName("a"));with tagName we ca't check 
		
		//find how many images are available on the page		
		//img---3
		
		
		//find how many input fields are available on the page		
		//input---3
		
		
		//find how many headers are available on the page		
		//h1---0
		
		
		//xpath for multiple classes : we can't use multiple classes with By.className. It will give an exception"InvalidSelectorException: Compound
		//classes are not allowed
		//By.className("form-control private-form__control login-email"); // not valid
		
		//Email address
		
		//we can use multiple classes with xpath
		//input[@class='form-control private-form__control login-email']  
		//input[contains(@class,'login-email')]  //valid
		//By.className("login-email")
		
		
		
		//interview question: which xpath is valid?
		
		//invalid
//		driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		
		//valid
//		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']  ")).sendKeys("test@gmail.com");
		
		//valid
//		driver.findElement(By.xpath("//input[contains(@class,'login-email')] ")).sendKeys("test@gmail.com");
		
		//valid
//		driver.findElement(By.className("login-email)] ")).sendKeys("test@gmail.com");
		
		
		//input[@@@@id,type/input]
		//if the xpath syntax is not valid it will throw 'InvalidSelectorException: invalid selector"
		
		
		//indexing in xpath
		
	}

}
