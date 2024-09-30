package webElement_Approaches;

import java.util.function.Supplier;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		// passing username(admin) & password(admin) in url itself
		//password: admin@123 doesn't work, since only one @ is allowed
		//we can have only single @ in the url
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//This is a 'authentication pop-up'. It is not JavaScript pop-up.
		//Authentication pop-ups are not JS alerts.
		//we can't switch to auth pop-ups
		//

		String username = "admin";
		String password = "admin";
		
//		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//Selenium 4.x they have added one new Interface HasAuthentication. 
		//HasAuthentication is a Interface. It indicates that a  driver supports authenticating to a website in some way.
		//It has a register() method.
		//ChromiumDriver class extends RemoteWebDriver & implements HasAuthentication. So it is applicable to only for Chrome & edge browsers. 
		
		
//		HasAuthentication hs = (HasAuthentication)driver;
//		hs.register((Supplier<Credentials>) new UsernameAndPassword(username,password) );//ClassCastException
		
		((HasAuthentication)driver).register( () -> new UsernameAndPassword(username,password));// ()-> is a js function, a function with no name
		//is called anonymous function.
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
