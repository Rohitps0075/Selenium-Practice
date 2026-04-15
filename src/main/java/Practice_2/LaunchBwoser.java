package Practice_2;

import org.openqa.selenium.WebDriver;

public class LaunchBwoser {

	public static void main(String[] args) {


		BrowserUtil_2 bUtil=new BrowserUtil_2();
		
		WebDriver driver=bUtil.initilzeBrowser("chrome");
		
		bUtil.launchURL("https://www.google.com/");
		
		System.out.println(bUtil.getPageTitle());
		
		System.out.println(bUtil.getPageURL());
		
		bUtil.QuitBrowser();
		
	}

}
