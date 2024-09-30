package practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Session ID: Whenever we create a new driver (WebDriver driver = new ChromeDriver()), new session ID will be generated.
 * Whatever action we perform using the driver(driver.get(),driver.getTitle() etc it will use the same session ID.
 * driver.quit():
 * When we enter driver.quit()after performing some actions it has the same session ID.
 * After driver.quit(), if we try to perform any action driver.getTitle(), it will throw an exception "NoSuchSessionException: Session ID is null. 
 * Using WebDriver after calling quit()?"
 *If we check the session ID now ,it is actually pointing to null for driver.getTitle(), since the driver is already closed in the above step.
 *We should not perform any action after driver.quit(). It should always be the last action.
 *
 *If we want to perform any action then we should launch the browser again, so new session ID will be created.
 *
 *
 *driver.close():
 *In case of driver.close(), session ID will become invalid, so it will throw an exception "NoSuchSessionException: invalid session id".
 *Here though the session id is same, but it is already expired, so we can't use the same session id.
 *
 * 
 */
public class QuitVsClose {

	public static void main(String[] args) {
		//Ctrl+Shift+o - to import packages
		WebDriver driver = new ChromeDriver();
		//hover over driver to get the Session ID
		//Session ID: fe9418eca2574d02bd7f3c39609fd225
		driver.get("https://www.google.com");
		//click on Step Over or F6
		//Session ID:: fe9418eca2574d02bd7f3c39609fd225
		String title = driver.getTitle();
		//Session ID: fe9418eca2574d02bd7f3c39609fd225
		System.out.println(title);
/*		driver.quit();//using same session ID until we run the next statement
		//Session ID: fe9418eca2574d02bd7f3c39609fd225
		driver.getTitle(); //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//Session ID: null
		//in above statement, browser is already closed, so if we try to get the title browser will be null & we get exception
*/		
		
/*		driver.close();//01fa6bcd393521a867322cf4e565ddb4
		driver.getTitle();//bc53e10e5c2852410ec1ad649dd64062, NoSuchSessionException: invalid session id
*/		
		driver.quit();
		driver = new ChromeDriver();
//		driver.getTitle();//we don't get anything here, since we have not entered any url
		
		driver.get("https://www.google.com");
		driver.getTitle();

	}

}
