package Selenium_Practice;

public class UseOFBrowserUtil {

	public static void main(String[] args) {


		BrowserUtil bUtil=new BrowserUtil();
		
		bUtil.initilize_Browser("Chrome ");
		
		bUtil.geturl("https://www.google.com");
		
		String title=bUtil.getPageTitle();
		System.out.println(title);
		
		String pageURL=bUtil.getCurrentURL();
		System.out.println(pageURL);
		
		bUtil.quitBrowser();
	}

}
