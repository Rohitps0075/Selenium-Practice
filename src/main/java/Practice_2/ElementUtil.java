package Practice_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {


	WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public  String isElementPresent(By Locators)
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
		public  String isElementPresent(By Locators, int ExpectedCount)
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
		public  String isElementNotPresent(By Locators)
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
		public  String isElementPresentMultipleTimes(By Locators)
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
	

	public  void doSearch(By sendKeysLocators, String Value, By Locators, String suggValue) throws InterruptedException
	{
		getElement(sendKeysLocators).sendKeys(Value);
		Thread.sleep(2000);
		List<WebElement> suggestionList=getElements(Locators);
		System.out.println(suggestionList.size());
		
		//List<String> suggList=new ArrayList<String>();
		
		for(WebElement e: suggestionList)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.contains(suggValue))
			{
				e.click();
				break;
			}
		}
		
	}
	public  void printElementText(By Locators)
	{
		List<String> textList=getElementsTextList(Locators);
		for(String e: textList)
		{
			System.out.println(e);
		}
		
	}
	public  List<String> getElementsTextList(By Locators)
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
	
	
	
	
	
	
	public  int getElementCount(By Locators)
	{
		return getElements(Locators).size();
	}
	
	public  List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}

	
	
	
	public boolean isSelected(By Locators)
	{
		try
		{
		return	getElement(Locators).isSelected();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not selected");
			return false;
		}
	}
	
	
	public boolean isElementEnabled(By Locators)
	{
		try {
			return getElement(Locators).isEnabled();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not enabled");
			return false;
		}
	}
	
	
	
	
	public  boolean isElementDisplayed(By Locators)
	{
		try
		{
		return getElement(Locators).isDisplayed();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not displayed");
			return false;
		}
	}
	public  void doSendkeys(By Locators, CharSequence...value)
	{
		getElement(Locators).sendKeys(value);
	}
	public String getElementText(By Locators)
	{
		return getElement(Locators).getText();
	}
	public void doClick(By Locators)
	{
		getElement(Locators).click();
	}
	
	public void doSendKeys(By Locators, String value)
	{
		getElement(Locators).sendKeys(value);
	}
	
	public WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	
	
}
