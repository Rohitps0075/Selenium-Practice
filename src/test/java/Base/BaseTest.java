package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Selenium_Practice.MyException;

public class BaseTest {
	
 	protected WebDriver driver;
 	// i have move the base test to different package
 	/*
 	 * so the classes which as extended the base class are throwing an error that driver is not accessable
 	 * now the access spesfier odf the driver is defalut-- which can be accessed with in the package
 	 * i will provide the protected to the driver which can be accessed outside the package and there should be child and parent relationship
 	 * 
 	 * public anyone can access so  no use
 	 * private only within the class
 	 */
	
 	
 	@Parameters({"url", "browserName"})
	@BeforeTest
	//public void setUp(@Optional("https://www.google.com") String url, @Optional("Chrome") String browserName)
	public void setUp(String url, String browserName)
	{
 		
 		switch(browserName.toLowerCase().trim())
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
 				System.out.println("please pass the right browser "+ browserName);
 				throw new MyException("========== Invalid Browser ==========");
 			
 			
 		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	/*
	 * lets pass the url from the testNG.xml file using parameter tag
	 * 
	 * so in the base class we need to use the @parameter tag and pass the value url like this ({"url"})
	 * then we need to pass this url to the before Test method
	 * 
	 * lets pass the browser details from the xml lets modify the base test accouringly
	 * 
	 */
	
	
	
	
	
	

}
