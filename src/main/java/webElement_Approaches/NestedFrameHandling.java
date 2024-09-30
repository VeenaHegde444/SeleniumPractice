package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(1000);
		
//		driver.switchTo().frame("pact1")
//		          .switchTo().frame("pact2")
//		             .switchTo().frame("pact3")
//		                  .findElement(By.id("glaf"))
//		                          .sendKeys(" Selenium");
		
		
//		driver.switchTo().frame("pact1")
//                 .switchTo().frame("pact2")
//                     .switchTo().frame("pact3")
//                        .switchTo().parentFrame()
//                            .switchTo().parentFrame()                            
//                                   .findElement(By.id("inp_val"))
//                                        .sendKeys("Testing");
		
		
		String header = driver.switchTo().frame("pact1")
                 .switchTo().frame("pact2")
                     .switchTo().frame("pact3")
                        .switchTo().parentFrame()
                            .switchTo().parentFrame()
                                .switchTo().defaultContent()
                                   .findElement(By.tagName("h3"))
                                        .getText();
		
		System.out.println(header);
		
//		driver.switchTo().frame("pact1");//frame1
//		driver.findElement(By.id("inp_val")).sendKeys("Testing");		
//		
//		driver.switchTo().frame("pact2");//frame2
//		driver.findElement(By.id("jex")).sendKeys("Selenium Automation");
//		
//		driver.switchTo().frame("pact3");//frame3
//		driver.findElement(By.id("glaf")).sendKeys("Good package");
		
		//driver is in frame3, now try to enter the value in frame2
//		driver.findElement(By.id("jex")).sendKeys(" Testing");//NoSuchElementException: no such element: Unable to locate element:
		
		//when we are in frame3, we can't access frame2 element---we need to switch back to frame2
		
		//parentFrame() : Change focus to the parent context. If the current context is the top level browsing context,the context remains unchanged.
		//f3-->f2
//		driver.switchTo().parentFrame();//frame2
//		driver.findElement(By.id("jex")).sendKeys(" Testing");
//		
//		
//		driver.switchTo().parentFrame();//frame1
//		driver.findElement(By.id("inp_val")).sendKeys(" with Passion");
		
		//f1-->page: defaultContent/parentFrame
//		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();//if parent is browser then it will switch to browser page
//		String header = driver.findElement(By.tagName("h3")).getText();//Memory Test
//		System.out.println(header);
//		
		//frame1 --> frame2
		
//		driver.switchTo().frame("pact2");//frame2
//		driver.findElement(By.id("jex")).sendKeys(" Selenium");
		
		//frame1 --> frame3 : won't work
//		driver.switchTo().frame("pact3");//frame3----NoSuchFrameException: No frame element found by name or id pact3
//		driver.findElement(By.id("glaf")).sendKeys("Good Perks");
		
		//different combinations:
		//page --> frame1 : works
		//frame1 -->frame2 : works
		//frame2 -->frame3 : works
		//page -->frame2 : doesn't work
		//page -->frame3 : doesn't work
		//page -->frame1 -->frame2 -->frame3 : works
		
		//backward
		//frame3 -->frame2 : works (should use parentFrame)
		//frame2 -->frame1 : works (should use parentFrame)
		//frame1 -->page : works (can use parentFrame,defaultContent)
		
		//frame3 --> frame2( parentFrame) -- >frame1 (parentFrame)
		
		//frame3 -->defaultContent -->page
//		driver.switchTo().defaultContent();//f1 or f2 or page(yes)
////		driver.findElement(By.id("inp_val")).sendKeys(" with veena");//NoSuchElementException: no such element: Unable to locate element:
//		
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
//		

	}

}
