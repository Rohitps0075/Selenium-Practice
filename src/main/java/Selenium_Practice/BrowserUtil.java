package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver initilize_Browser(String browserName)
	{
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
		driver=new EdgeDriver();
		break;
		
		case"IE":
			driver=new InternetExplorerDriver();
			break;
		

		default:
			System.out.println("please pass the right browser "+ browserName);
			throw new MyException("########## Invalid Browser#########");
			}
		return driver;
		
	}

	public void geturl(String URL)
	{
		if(URL.indexOf("http")!=0)
		{
			throw new MyException("######## Pass the Right URL ########");
		}
		driver.get(URL);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentURL()
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
