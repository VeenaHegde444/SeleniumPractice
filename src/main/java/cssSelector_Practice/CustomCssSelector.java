package cssSelector_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//CSS: Cascaded Style Sheet - it is used to provide look & feel for web page
		
		//cssSelector : is a locator
		
		//1. id
		
		// it will start from '#'
//#id
		//#input-email
		//we can also write with htmltag 
//tagName#id
		//input#input-email---preferred
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
		
		//2.class
		
		//it will start from '.'
//.classname
		//.form-control---3
		
//tagName.classname	
		//input.form-control
		
		
		//what if we have multiple classes? (https://app.hubspot.com/login)
		//All classes will start with '.'
//.c1.c2.c3...cn
		//.form-control.private-form__control.login-email
		
//tagName.c1.c2.c3...cn
		
		//input.form-control.private-form__control.login-email
		
		//out of 3 using only 2 classes
		//input.form-control.login-email
		
		//out of 3 using only 1 class
		//input.login-email
		
		
		
		
		//id & class together
//#id.classname
		//#username.login-email
		
//.classname#id
		//.login-email#username
		
//tagName#id.classname
//tagName.classname#id
		
		//input.login-email#username
		//input#username.login-email
		
		//using all classnames & id
		//input.form-control.private-form__control.login-email#username
		//input#username.form-control.private-form__control.login-email
		
//tagName.c1#id.c2.c3
		//input.form-control#username.private-form__control.login-email
		
		
		//3. if id & classname is not available, any other attribute in cssSelector
		
//tagName[attribute='value']	
		
		//input[name='email']
		//input[placeholder='E-Mail Address']
		//input[id='input-email']
		
		
		/*
		 input[name='email']---cssSelector
		 //input[@name='email']---xpath
		 * 
		 * */
		 
		//input[name='email']#input-email
		//input#input-email[name='email']
		//input#input-email[name='email'].form-control
		
		//4.using multiple attributes
//tagName[attribute1='value'][attribute2='value'][attribute3='value']
		
		//input[name='email'][placeholder='E-Mail Address']
		//input[name='email'][placeholder='E-Mail Address'][type='text']
		//input[name='email'][placeholder='E-Mail Address'][type='text']#input-email
		
		
		//can we create the cssSelector with the help of text?
		//No support for text in cssSelector. No support for text, paragraph
		
		
		//5.contains:    *= is used for contains
//tagName[attribute *= 'value']
		
		//input[placeholder*='E-Mail']
		//input[placeholder*='E-Mail']
		//input[placeholder*='Address']
		//input[placeholder*='E-Mail Address']
		
		
		
		//6.starts-with:   ^= is used for starts-with
//tagName[attribute *= 'value']	
		
		//input[placeholder ^='E-Mail']
		
		
		
		//7.ends-with:   $= is used for ends-with
//tagName[attribute $= 'value']	
		
		//input[placeholder $='Address']
		
		
		//8. parent to child: space (direct + indirect child elements)
//parenttagName childtagName : indirect child elements
		
		//form#hs-login input#username   (form is a parent, input is a child)
				
		
		//9. parent to child: > (direct child element)
//parenttagName > childtagName
		
		//form#hs-login > div---8 (8 direct child elements under form)
		//form#hs-login div---23 (direct + indirect child elements)
		
		//select#Form_getForm_Country > option --will give all direct child elements (https://www.orangehrm.com/30-day-free-trial/)
		
		
		//all footer links
		//footer a 
		
//		List<WebElement> footerLinksList = driver.findElements(By.cssSelector("footer a"));
//		for(WebElement e: footerLinksList) {
//			String footerLinks = e.getText();
//			System.out.println(footerLinks);
//		}
//		
		
		//10. child to parent: NA--backward traversing is not allowed with css
		
		//11. sibling in css: only following sibling is allowed. we should use '+', it will give immediate following sibling.
		//from E-Mail Address label to E-Mail Address input filed---for siblings we should use '+'
//tagName[attribute='value'] + siblingtagName 
		
		
		//label[for='input-email'] + input  (here label is having following sibling input)
		
		
		//moving from country dropdown to option, where value='Afghanistan' then select the sibling, it will select the next sibling
		//select#Form_getForm_Country > option[value='Afghanistan'] + option
		
		
		//'+' will give immediate following sibling
		//'~' will give all following siblings
		
		//select#Form_getForm_Country > option[value='Afghanistan'] ~ option ---231  (after 'Afghanistan' all siblings)
		
		//1.13
		
	    //12. index in css:
		//we should use 'nth-of-type()'
		
		//select#Form_getForm_Country > option:nth-of-type(3)--2nd index
		//select#Form_getForm_Country > option:nth-of-type(n)---all elements
		
		//select#Form_getForm_Country > option:first-child ---1st child element--Country
		//select#Form_getForm_Country > option:last-child---last child element --Zaire
		
		//select#Form_getForm_Country > option:nth-child(5)--5th index		
		//select#Form_getForm_Country > option:nth-last-child(5)---from last 5th index
		//select#Form_getForm_Country > option:nth-last-child(n)---all elements
		
		//select#Form_getForm_Country > option:nth-child(odd)
		//select#Form_getForm_Country > option:nth-child(even)
		
		//select#Form_getForm_Country > option:nth-child(n+4)---starts from the index 4
		//select#Form_getForm_Country > option:nth-child(5n)--5th element,10th,15th & so on ( 5 multiplication)
		
		
		//using xpath: odd & even
		//select[@id='Form_getForm_Country']/option[position() mod 2 = 1]--- odd (117 elements)
		//select[@id='Form_getForm_Country']/option[position() mod 2 = 0]---even (116 elements)
		
		
		//comma in css: using comma we can multiple elements 
		
		//input#username,input#password,button#loginBtn
		//input#username,input#password,button#loginBtn,input#remember
		
		
		//not in css: 
		
		//input.form-control:not(input[name='search'])
		//input.form-control:not(input[name='search']):not(input[name='password']
		//input.form-control:not(input[name='search']):not(input#input-password)
	}

}
