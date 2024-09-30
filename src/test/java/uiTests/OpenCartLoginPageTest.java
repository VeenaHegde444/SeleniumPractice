package uiTests;
/*
 * @DataProvider: Marks a method as supplying data for a test method. The annotated method must return an Object[][] where each Object[] can be 
 * assigned the parameter list of the test method. The @Test method that wants to receive data from this DataProvider needs to use a dataProvider 
 * name equals to the name of this annotation.
 * 
 * In Object[][] we can provide any kind of data.We have to use it with literals.
 *After creating the Object[][] array,  @Test method we have to do the mapping. We have to provide dataProvider="method name"
 * dataProvider:The name of the data provider for this test method.
 * 
 * 
 * csv-comma separated value
 */
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class OpenCartLoginPageTest extends BaseTest{
	
	//data driven approach: fetch the test data from data providers: testNG dataProvider, excel, csv, JSON etc
	//Data driven approach is also called parameterization of test cases.
	
	
	
	//Object[][] - it is a 2D array.
	
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {
			{"macbook","MacBook Pro"},
			{"imac","iMac"},	
			{"samsung","Samsung Galaxy Tab 10.1"},	
			{"samsung","Samsung SyncMaster 941BW"}		
		};
	}
	@Test(dataProvider="getSearchData")
	public void searchTest(String searchKey,String productName) {//without holding parameters it will not know what to read from getSearchData method
		driver.findElement(By.cssSelector("input.form-control.input-lg")).clear();
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys(searchKey);
		driver.findElement(By.className("input-group-btn")).click();
		driver.findElement(By.linkText(productName)).click();
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		Assert.assertEquals(header, productName);
		
		
		
		
		
		
		
		
		
    }

}
