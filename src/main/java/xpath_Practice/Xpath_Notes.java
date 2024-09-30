package xpath_Practice;

/*
 * xpath: XML Path : HTML XML Path : address of the element in the DOM
 * DOM - HTML+XML
 * 
 * XPath : XPath stands for XML Path Language. It is a selenium technique to navigate through a page's HTML structure.
 * 
 * XPathExpression: 
 * 
 * Types: 
 * 
 * Absolute xpath : Begins from the root of the HTML document & specifies the complete path to the element. It is not as flexible & can break
 * if the page structure changes.
 * 
 * It starts from single slash. Absolute xpath is also called as single slash search.
 * 
 * Relative xpath : Starts from a specific element & navigates through the DOM hierarchy to locate the desired element. It is more flexible
 * & resilient to changes in the page structure.
 * 
 * It starts from double slash.
 * 
 * Relative attributes of the element: id,class,name,type,text
 * Using Attributes:
 * 
 **  //htmltag[@attribute='value']
 **  //htmltag[@attribute1='value' and attribute1='value']
 *           
 * We can use multiple attributes.
 * 
 * For attributes we should use '@'.          
 *           
 *           //text() : it is a function in xpath
 **  //htmltag[text() ='value']
		 
	Using logical operators: and & or
	
*	When we have a common property, then we can go with 'and' operator(multiple attributes).
*	Using 'or' is a bad approach.
*	div - division in XML. It is used to arrange similar kind of elements.

	*how many links are available in the page?
	*By.xpath("//a")
	
	*how many images are there?
	*By.xpath("//img")
	*
	*
	*how many text fields are there?
	*By.xpath("//input[@type='text']
	*
	*total no. of links with href values?
	*By.xpath("//a[@href]")
	*
	*
	*
	
	06/08/2024:
	
	contains() : it is a function. It is used when the value of any attribute changes dynamically.
	It has an ability to find the element with partial text. 
	
**	//htmltag[contains(@attribute,'value')]	
**  //htmltag[contains(@attribute1,'value') and contains(@placeholder,'value')] 
**  //htmltag[contains(text(),'value')]
		 
		 
	starts-with() : It is a function used for finding the web element whose attributes value gets changed on refresh or by other dynamic operations
	on the web page.
	Here starting text of the attribute is matched to find the element whose attribute value changes dynamically.
	
	 Ex: Your OTP number is 123.( 123 is dynamic,
	
	ends-with(): It is deprecated
		 
		 
	Indexing in xpath:
	
	Capture group: combine all together, store it in a collection
	()[] : capture group then use indexing	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
 */
public class Xpath_Notes {

}
