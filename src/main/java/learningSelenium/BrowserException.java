package learningSelenium;

public class BrowserException extends RuntimeException{
	
	//constructor, accepts String message, so that we can throw our custom message
	//super is used to call parent class 
	
	//Exception Hierarchy: Throwable --> Exception -->RuntimeException(parent) -->ArithmeticException,NullPointerException,ClassCastException,
	//IndexOutOfBoundsException(ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException)
	public BrowserException(String message) {
		super(message);
	}

}
