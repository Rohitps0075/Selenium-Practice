package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkElementIsPresent {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver =new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By firstName=By.id("input-email");
		By forgotpassword=By.xpath("//a[text()='Forgotten Password']");
		
//		List<WebElement> list=driver.findElements(firstName);
//
//		int count=list.size();
//		
//		if(count==1)
//		{
//			System.out.println("the element is present");
//			
//		}
//		else
//		{
//			System.out.println("the element is not present");
//		}
	
		
		String value=isElementPresent(firstName);
		System.out.println(value);
		
		
		String value1=isElementPresent(forgotpassword, 2);
		System.out.println(value1);
	}

	public static String isElementPresent(By Locators)
	{
		List<WebElement> list=driver.findElements(Locators);
		int count=list.size();
		
		if(count==1)
		{
			 return "Element is Present";
			 
		}
		else
		{
			return "Element is not Present";
		}
	}
		public static String isElementPresent(By Locators, int ExpectedCount)
		{
			List<WebElement> list=driver.findElements(Locators);
			int count=list.size();
			
			if(count==ExpectedCount)
			{
				 return "Element is Present";
				 
			}
			else
			{
				return "Element is not Present";
			}
		
	}
		public static String isElementNotPresent(By Locators)
		{
			List<WebElement> list=driver.findElements(Locators);
			int count=list.size();
			
			if(count==0)
			{
				 return "Element is Present";
				 
			}
			else
			{
				return "Element is not Present";
			}
		
	}
		public static String isElementPresentMultipleTimes(By Locators)
		{
			List<WebElement> list=driver.findElements(Locators);
			int count=list.size();
			
			if(count>=1)
			{
				 return "Element is Present";
				 
			}
			else
			{
				return "Element is not Present";
			}
		
	}
	
	
	
	
	
	
	
	
}
