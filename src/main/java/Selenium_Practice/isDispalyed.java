package Selenium_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDispalyed {
/*
 * isdisplayed method will give true or false if the element is displayed on the ui.
lets see the genric method directly.
 */
	
	static WebDriver driver ;
	public static void main(String[] args) {


		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		boolean b=driver.findElement(By.id("input-firstname")).isDisplayed();
		System.out.println(b);
		/*the problem with is displayed method is , if the locator that we are passing is incorrect then we will get no such 
		 * element execption but isdisplayed method will give any false o/p so we need to handel this by try cach block let create a genaric method
		 * 
		 */
		
		
		boolean b1=isElementDisplayed(By.id("input-firstname11"));
		System.out.println(b1);
		
		
		
	}
	
	public static boolean isElementDisplayed(By Locators)
	{
		try
		{
		return getElement(Locators).isDisplayed();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not displayed "+ Locators);
			return false;
			
		}
	}
	public static WebElement getElement(By Locators)
	{
	return driver.findElement(Locators);	
	}

}
