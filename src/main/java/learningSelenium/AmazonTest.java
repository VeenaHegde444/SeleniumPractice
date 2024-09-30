package learningSelenium;

public class AmazonTest {

	public static void main(String[] args) {
		//create the object of BrowserUtil class
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.amazon.com");
		String title = brUtil.getPageTitle();
		if(title.contains("Amazon")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		System.out.println(brUtil.getPageUrl());
		brUtil.quitBrowser();

	}

}
