package webElement_Approaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	static WebDriver driver;
	        
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		//drag & drop: it is from element to element
		//when doing drag & drop, we will click & hold the element first then release it.
		
		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");
		
		//Actions : it is a class, we need to pass the driver.
		Actions action = new Actions(driver);
		
//		action.clickAndHold(driver.findElement(sourceElement))
//		         .moveToElement(driver.findElement(targetElement))
//		            .build()
//		               .perform();
		
		
		//build() : it will return Action.
		//Action is a Interface.
		//we can save build() actions using Action Interface and later reuse it
		
//		Action dragAndDrop = action.clickAndHold(driver.findElement(sourceElement))
//                  .moveToElement(driver.findElement(targetElement))
//                     .build();
//		
//		dragAndDrop.perform();
		              
		//Can we use only .build() --> NO, build() will not perform any action, it is used to generate a composite action containing all actions so far,ready to be performed. 
		//Can we use only .perform() --> YES, it is mandatory to use perform() in Actions class.
		//Can we use both .build().perform() --> YES
		
		//.build() --> return Action --> can be reused  
		
		action.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement)).perform();
		
		
		//Actions -- class -- is used to achieve the builder pattern using method chaining to perform various actions in a sequence
		//Action -- Interface -- build() will return Action (single or composite action) --which can be used later to peform
		

	}

}
