package practice_Selenium;

public class DemoBlazeTest {

	public static void main(String[] args) {
		BrowserUtil util = new BrowserUtil();
		util.initializeBrowser("chrome");
		util.launchUrl("https://www.demoblaze.com/");
		String title =util.getPageTitle();
		if(title.equals("STORE")) {
			System.out.println("Titles are matching--PASS");
		}
		else {
			System.out.println("Titles are not matching--FAIL");
		}
		
		System.out.println(util.getPageUrl());
		util.quitBrowser();

	}

}
