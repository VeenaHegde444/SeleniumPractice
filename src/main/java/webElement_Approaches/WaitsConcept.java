package webElement_Approaches;
/*
 * Selenium Waits: There are two types of waits; Static wait & Dynamic wait
 * 
 * Static Wait: Thread.sleep() is a static wait. Thread is a class & sleep() is a method. Thread.sleep() is from Java not from Selenium.
 * 
 * Dynamic Waits: These are from Selenium.
 * 
 * ImplicitlyWait:
 * ExplicitlyWait: WebDriverWait & FluentWait
 * 
 * 
 * Sometimes the browser gets into the right state first(things work as intended) & sometimes the Selenium code execute first (things don't work
 * as intended). This is the primary causes of flaky tests.
 * 
 * Page load strategy: the default value to wait for is 'complete'.
 */
public class WaitsConcept {

	public static void main(String[] args) {
		
		//we need waits for sync between application & scripts.
		//script ---sync(wait) --->app(browser)
		
		//1.Static Wait 
		//Thread.sleep(1000) -->Java
		
		//2.Dynamic Wait
		//10 secs wait: element appeared in 2 secs 
		//10 secs wait: element appeared in 0 secs
		//10 secs wait: element appeared in 15 secs : NoSuchElementException
		
		//2.1 Implicitly Wait
		//2.2 Explicitly Wait
		       //2.2.a :WebDriverWait
		       //2.2.b : FluentWait 
		

	}

}
