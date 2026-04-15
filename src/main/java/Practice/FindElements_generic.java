package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_generic {
	static WebDriver driver;
	
	public static void main(String[] args) {

		 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		/*
		 * from line 21 to 34 we have write a normal way so now lets create a genric methods for each
		 */
		
//		List<WebElement> TotoalLinks=driver.findElements(By.tagName("a"));
//		
//		int countofLinks=TotoalLinks.size();
//		System.out.println(countofLinks);
//		
//		for(WebElement e:TotoalLinks)
//		{
//			String TextonLinks=e.getText();
//			if(TextonLinks.length()!=0)
//			{
//				System.out.println(TextonLinks);
//			}
//			
//		}
		
		By Links=By.tagName("a");
		List<WebElement> TotalLinks=getElements(Links);
		int countOfLinks=TotalLinks.size();
		System.out.println(countOfLinks);// 81 links, lets make a genric method for .size() method also. see line no 55
			
				
				// use of generic method
				
				System.out.println(getElementCount(Links));
				
				// lets make a genric method for to feach the text of each link. see line 68
			
				// use of genric method
				
				List<String> T_link=getElementsText(Links);

				// to print again we have use for each loop so lets make a genric method  to print the links see line 91
				PrintElementText(Links);
		driver.quit();
			
	}
/**
 * below is the generic method for findelements
 * so make webdriver as a global variable and satic so we can access with creating the object.
 */
	
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}
	
	public static int getElementCount(By Locators)
	{
		return getElements(Locators).size();
	}
	
	public static List<String> getElementsText(By Locators)
	{
		List<WebElement> Link_1=getElements(Locators);
		List<String> Link_2=new ArrayList<String>();
		
		for(WebElement e:Link_1)
		{
			String LinkText=e.getText();
			
			if(LinkText.length()!=0)
			{
				Link_2.add(LinkText);
			}
		}
		return Link_2;
		
	}
	public static void PrintElementText(By Locators)
	{
		List<String> Text_of_links=getElementsText(Locators);
		for(String e:Text_of_links)
		{
			System.out.println(e);
		}
	}
	
}
