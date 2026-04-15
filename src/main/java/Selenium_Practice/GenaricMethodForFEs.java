package Selenium_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenaricMethodForFEs {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By images=By.tagName("img");
		By links=By.tagName("a");
		
//		List<WebElement> linkList=driver.findElements(links);
//		int imgLinks=linkList.size();
//		System.out.println(imgLinks);
//		
//		for(WebElement e: linkList)
//		{
//			String text=e.getText();
//			if(text.length()!=0)
//			{
//				System.out.println(text);
//			}
//		}
		
		 int count=getElementsCount(links);
		 System.out.println(count);
		 
		 printElementTextList(links);
		
	}
	public static void printElementTextList(By Locators)
	{
		List<String>textValue=getElementTextList(Locators);
		for(String e: textValue)
		{
			System.out.println(e);
		}
	}

	public static List<String> getElementTextList(By Locators)
	{
		List<WebElement> List=getElements(Locators);
		List<String> TextList=new ArrayList<String>();
		
		for(WebElement e: List)
		{
			String text=e.getText();
			if(text.length()!=0)
			{
				TextList.add(text);
			}
		}
		return TextList;
	}
	
	
	public static int getElementsCount(By Locators)
	{
		return getElements(Locators).size();
	}
	
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}
}
