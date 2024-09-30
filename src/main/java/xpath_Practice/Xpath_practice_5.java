package xpath_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_practice_5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// input fields which are having id attribute
		
		//input[@id]---6
		
		//contains(): It is a function in xpath.
		
		//Syntax: 
		
		//1.htmltag[contains(@attribute,'value']---for single attribute
		//2.htmltag[contains(@attribute1,'value') and contains(@attribute1,'value')]---for two attributes
		//3.htmltag[contains(@attribute1,'value') and @attribute2='value']---1st attribute contains(), 2nd attribute without contains()

		//when we should use contains()?
		//
		
		//find all text fields using contains() function
		
		//First Name
		//input[contains(@id,'input-firstname')]---for single attribute
		//input[contains(@id,'firstname')]----we can pass partial text
		//input[contains(@id,'firstname') and contains(@name,'firstname')]---for two attributes
		
		//1st attributes with contains(), 2nd attributes without contains()
		//input[contains(@name,'firstname') and @id='input-firstname']
		//input[@id='input-firstname' and contains(@name,'firstname')]
		
		
		
		
		//contains() with text(): we can use when we have a long text without any attributes, useful where we can pass partial text
		//htmltag[contains(text(),'value')]
		
		//Register Account header
		//h1[contains(text(),'Register Account')]
		//h1[contains(text(),'Register')]
		
		
		//If you already have an account with us, please login at the login page.
		//p[contains(text(),'please login')]
		
		
		//Your Personal Details
		//legend[contains(text(),'Personal')]---can pass partial text
		
		//Last Name
		//input[contains(@id,'input-lastname')]
		
		//E-Mail
		//input[contains(@name,'email')]
		
		//Telephone
		//input[contains(@placeholder,'Telephone')]
		
		//Password
		//input[contains(@name,'password')]
		
		//Password Confirm
		//input[contains(@id,'input-confirm')]
		
		
		//html DOM---every time if we reload the page id is changing i.e the numeric part, firstname_ is constant.
		//dynamic ids/attributes
		
		//<input "id='firstname_123">
		//<input "id='firstname_456">
		//<input "id='firstname_789">
		
		//input[contains(@id,'firstname_')]
		
		
		//<span "type=text" your transaction id is 1234 /span>---dynamic text
		//span[contains(text(),'your transaction id is')]
		
		
		//contains() with attribute & no contains with text()
		//htmltag[contains(@attribute,'value') and text()='value']
		//a[contains(@href,'/wishlist') and text()='Wish List']---2
		
		
		//contains() with attribute & contains with text()
		//htmltag[contains(@attribute,'value') and contains(text()='value')]
		//a[contains(@href,'/wishlist') and contains(text(),'Wish List')]
		
		
		//starts-with(): 
		//htmltag[starts-with(@attribute,'value')]
		
		//FirstName
		//input[starts-with(@placeholder,'First')]
		
		//Register Account
		////h1[starts-with(text(),'Register')]
		
		
		//ends-with(): it is deprecated
		
		//Class:
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
		
		//find all elements with input field
		
		//input[@class='form-control']---6
		
		//apply capture group & indexing
		
//		(//input[@class='form-control'])[1]--First Name
//		(//input[@class='form-control'])[2]--Last Name
//		(//input[@class='form-control'])[3]--E-Mail	
//		(//input[@class='form-control'])[4]--Telephone
//		(//input[@class='form-control'])[5]--Password
//		(//input[@class='form-control'])[6]--Password Confirm	
		
		//to go to last field
//		(//input[@class='form-control'])[last()]---Password Confirm, we can use last() function
//		(//input[@class='form-control'])[last()-1]--Password
		
		//position():
		
//		(//input[@class='form-control'])[position()=1]
//		(//input[@class='form-control'])[position()=2]
//		(//input[@class='form-control'])[position()=last()]
		
		
		//Subscribe 'Yes' & 'No' radio button text---it is associated with  '//label'
		//it has space before the text
		//in case of space before the text we should use 'normalize-space()'. It is only for text based element.
		
		//Syntax: //htmltag[normalize-space()='value']
		
		//label[normalize-space()='Yes']
		//label[normalize-space()='No']
		
		
		//* is a wildcard
		
		
	}

}
