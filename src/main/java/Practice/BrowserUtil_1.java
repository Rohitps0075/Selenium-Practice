package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil_1 {

	WebDriver driver;
	
	/**
	 * this a genric method and it is used to launch the browser.
	 * 
	 * @param Browser
	 * @return
	 */
	public WebDriver launchbrowser(String Browser)
	{
		switch (Browser.trim().toLowerCase())
		{
		case "chrome":
		driver =new ChromeDriver();
		break;
		
		case "edge":
			driver=new EdgeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			
			default:
			System.out.println("Please pass the right browser "+Browser);
			throw new MyException("wrong browser");
		}
		return driver;	
		}
	
	
	public void launchURL(String url)
	{
		if(url.indexOf("http")!=0)
		{
			System.out.println("please pass the correct url");
			throw new MyException("wrong URL");
		}
		driver.get(url);
	}
	
	
	public String getPageTitle()
	{
	return	driver.getTitle();
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
