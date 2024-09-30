package webElement_Approaches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * ThreadLocal is a java class & it is introduced after JDK 8.
 * It is helpful in parallel execution. If we are running 100+/500+ test cases, driver management is very important. We have to distribute the 
 * driver equally each & every thread.
 * 
 * In DriverFactory if the WebDriver is static, it will be stored in CMA, one thread will lock the driver until it finishes the work.
 * Static means it will maintain only one copy. Other threads will not get driver & shows 'NPE'.
 * 
 * Here, we are creating only one driver object, but each thread will get a local copy.
 * 
 * Very good solution to use ThreadLocal in parallel execution.
 * 
 * We have to create object of ThreadLocal class, & generic will be 'WebDriver' in DriverFactory class.
 * 
 * ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>(); 
 * 
 * After creating the object we have to set the ThreadLocal.
 * 
 *  case "chrome": tlDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
 *  
 *  return getDriver();
 *  
 *  After setting, we have to get it.
 *  
 *  	public static WebDriver getDriver() {
		return tlDriver.get();
	}
 *  
 *  Advantage of ThreadLocal is that it will distribute the driver among all the threads locally.
 */
public class ThreadLocalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
