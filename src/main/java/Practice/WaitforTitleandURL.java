package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleandURL {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		boolean flag = waitforTitle(10, "Account Login");
//		System.out.println(flag);

//		String title=getTitle(10, "Account Lagin");
//	System.out.println(title);
		
		String title=getTitlecontains(10, "Account");
		System.out.println(title);
		
		
		String url=getURL(10, "hello");
		System.out.println(url);
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(null)); // webelement
		wait.until(ExpectedConditions.visibilityOfElementLocated(null)); // webelement
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(null)); // list<webelement>
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null)); // list<webelement>
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))); 
		
		wait.until(ExpectedConditions.titleIs("")); // boolean value
		wait.until(ExpectedConditions.titleContains(""));// boolean value
		
		
		wait.until(ExpectedConditions.urlContains(""));// boolean value.
		
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static boolean waitforTitle(int timeouts, String ExpectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		try {
			return wait.until(ExpectedConditions.titleIs(ExpectedTitle));
		} catch (TimeoutException e) {
			System.out.println("title is not matching");
			return false;
		}

		// this method will give the boolen value
		// if title matched with expected title that we have specified then this method
		// will give true or else false.
		// the problem with this code is when we pass the wrong expected value the
		// method will wait for 10sec then it will throw the exception so we need to
		// handle this

	}
	public static String getTitle(int timeouts, String ExpectedTitle)
	{
		if(waitforTitle(timeouts, ExpectedTitle))
		{
			return driver.getTitle();
		}
		else
		{
			return "-1";
		}
	}
	
	public static boolean waitforTitleContains(int timeouts, String expectedTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		
		try {
			return wait.until(ExpectedConditions.titleContains(expectedTitle));
		}
		catch(TimeoutException e)
		{
			System.out.println("title is not matching");
			return false;
		}
				
	}
	
	public static String getTitlecontains(int timeouts, String expectedTitle)
	{
		if(waitforTitleContains(timeouts, expectedTitle))
		{
			return driver.getTitle();
		}
		else
		{
			return "-1";
		}
	}
	
	
	public static boolean waitforURL(int timeouts, String expectedURL)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeouts));
		
		try {
			return wait.until(ExpectedConditions.urlContains(expectedURL));
		}
		catch(TimeoutException e)
		{
			System.out.println("incorrect url: please pass the right url");
			return false;
		}
	}
	
	public static String getURL(int timeouts, String expectedURL)
	{
		if(waitforURL(timeouts, expectedURL))
		{
			return driver.getCurrentUrl();
		}
		else
		{
			return "-1";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
