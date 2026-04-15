package Practice_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtil_2 {

	
	WebDriver driver;
	
	public WebDriver initilzeBrowser(String Browser)
	{
		switch(Browser.trim().toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;
			
		default :
			System.out.println("please pass the right browser");
			throw new MyException("=======Invalid browser==============");
			
		
		}
		return driver;
	}
	
	public void launchURL(String URL)
	{
		if(URL.indexOf("http")!=0)
		{
			throw new MyException("===========Invalid http===============");
		}
		driver.get(URL);
	}
	
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void QuitBrowser()
	{
		driver.quit();
	}
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
