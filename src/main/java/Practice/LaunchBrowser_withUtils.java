package Practice;

public class LaunchBrowser_withUtils {

	public static void main(String[] args) {

		BrowserUtil br=new BrowserUtil();
		
		br.initizeBrowser("chrome");
		
		br.launchURL("https://www.google.com");
		
		String title=br.getPageTitle();
		
		if(title.contains("Google"))
		{
			System.out.println("Title validation Pass");
			
		}
		else
		{
			System.out.println("Title validation Fail");
		}
		
		String url=br.getPageCurrentURL();
		System.out.println(url);
		
		
		br.quitBrowser();
	}

}
