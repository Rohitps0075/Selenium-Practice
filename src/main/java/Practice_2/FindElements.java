package Practice_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	static WebDriver driver;
	public static void main(String[] args) {


		 driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links=By.tagName("a");
		
//		List<WebElement> allLinks=driver.findElements(links);
//	
//	
//		int totalLinks=allLinks.size();
//		System.out.println(totalLinks);
//		
//		for(WebElement e:allLinks)
//		{
//			String text=e.getText();
//			if(text.length()!=0)
//			{
//				System.out.println(text);
//			}
//		}
	
		System.out.println(getElementCount(links));
		printElementText(links);
	}
	
	public static void printElementText(By Locators)
	{
		List<String> textList=getElementsTextList(Locators);
		for(String e: textList)
		{
			System.out.println(e);
		}
		
	}
	public static List<String> getElementsTextList(By Locators)
	{
		List<WebElement> list1=getElements(Locators);
		List<String> list2= new ArrayList<String>();
		
		for(WebElement e:list1)
		{
		String text=e.getText();
		if(text.length()!=0)
		{
			list2.add(text);
		}
		}
		return list2;
	}
	
	
	
	
	
	
	public static int getElementCount(By Locators)
	{
		return getElements(Locators).size();
	}
	
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}

}
