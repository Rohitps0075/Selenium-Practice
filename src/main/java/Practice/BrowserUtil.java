package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver initizeBrowser(String Browser)
	{
		switch (Browser.trim().toLowerCase()) 
		{
		case "chrome":
			driver=new ChromeDriver();
						break;
		case "edge":
			driver=new EdgeDriver();
						break;
						
		case "firefox":
			driver=new FirefoxDriver();
						break;
		default:
			System.out.println("Plaes pass the right browsers");
			throw new BrowserException("Invalid browser");
			
		}
		return driver;
		
	}
	
	public void launchURL(String url)
	{
		if(url.indexOf("http")!=0)
		{
			System.out.println("Invalid URL");
			throw new BrowserException("Invalid URL");
		}
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
