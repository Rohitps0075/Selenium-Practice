package Selenium_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
		
	}
	public void doSendKeys(By Locators, String Value)
	{
		getElement(Locators).sendKeys(Value);
		
	}
	
	public void doClick(By Locators)
	{
		getElement(Locators).click();
	}
	
	public String getElementText(By Locator)
	{
	return	getElement(Locator).getText();
	}

	public  void dosendKeys(By Locators, String value)
	{
		getElement(Locators).sendKeys(value);
	}
	
	public  void dosendkeys(By Locators, CharSequence...value)
	{
		getElement(Locators).sendKeys(value);
	}
	
	public  boolean isElementDisplayed(By Locators)
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
	
	public  boolean isElementEnabled(By Locators)
	{
		
		try
		{
			return getElement(Locators).isEnabled();
		}
		catch (NoSuchElementException e) {
			System.out.println("Element is not enabled "+Locators);
			return false;
			
		}
	}
	public  boolean isElementSelected(By Locators)
	{
		try
		{
			return getElement(Locators).isSelected();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not selected "+Locators);
			return false;
		}
	}
	
	public  String getElementAttribute(By Locators, String value)
	{
		return getElement(Locators).getAttribute(value);
	}
	
	public  void printElementTextList(By Locators)
	{
		List<String>textValue=getElementTextList(Locators);
		for(String e: textValue)
		{
			System.out.println(e);
		}
	}

	public  List<String> getElementTextList(By Locators)
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
	
	
	public  int getElementsCount(By Locators)
	{
		return getElements(Locators).size();
	}
	
	public  List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}
	
	public  void doSearch(By SearchField, String SearchValue, By SuggestionList, String clickValue) throws InterruptedException
	{
		
	driver.findElement(SearchField)	.sendKeys(SearchValue);
	
	Thread.sleep(2000);
	
	List<WebElement> suggList=driver.findElements(SuggestionList);
	int suggCount=suggList.size();
	System.out.println(suggCount);
	
	for(WebElement e: suggList)
	{
		String text=e.getText();
		System.out.println(text);
		if(text.contains(clickValue))
		{
			e.click();
			break;
		}
	}
		
	}
	
	public  boolean isElementPresent(By Locators, int ExpectedCount)
	{
		if(getElementsCount(Locators)==ExpectedCount)
		{
			return true;
		}
		return false;
	}
	
	public  boolean isElementPresent(By Locators)
	{
		if(getElementsCount(Locators)==1)
		{
			return true;
		}
		return false;
	}

	
	//############ Select Class ##############
	public  int getDropDownOptionCount(By Locators)
	{
		//Select select=new Select(getElement(Locators));
	List<WebElement>	optionList=getSelect(Locators).getOptions();

	return optionList.size();	

	}
	
	public  void doselectbyVisableText(By Locators, String visiableText)
	{
		//Select select=new Select(getElement(Locators));
		getSelect(Locators).selectByVisibleText(visiableText);
	}
	
	public  void doselectbyValue(By Locators, String value) {
		//Select select=new Select(getElement(Locators));
		getSelect(Locators).selectByValue(value);
	}
	public  void doselectbyIndex(By Locators, int index)
	{
		//Select select=new Select(getElement(Locators));
		getSelect(Locators).selectByIndex(index);
	}
	
public  void selectDropDown(List<WebElement> optionList, String value) {
		
		System.out.println(optionList.size());
		
		for(WebElement e : optionList)
		{
		String text=e.getText();
		System.out.println(text);
		if(text.contains(value))
		{
			e.click();
			break;
		}
	}
	}
	
	public  void selectDropDownValue(By Locators, String value)
	{
		List<WebElement> optionList=getElements(Locators);
		
		selectDropDown(optionList, value);
//		System.out.println(optionList.size());
//		
//		for(WebElement e : optionList)
//		{
//		String text=e.getText();
//		System.out.println(text);
//		if(text.contains(value))
//		{
//			e.click();
//			break;
//		}
//		
//		}
	}
	
	//similary we can create a generic method for select class als
	public  void selectDropDownvalueUsingSelect(By Locators, String value)
	{
		//Select select=new Select(getElement(Locators));
		
		List<WebElement> optionList=getSelect(Locators).getOptions();
		selectDropDown(optionList, value);
//		System.out.println(optionList.size());
//		for(WebElement e: optionList)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains(value))
//			{
//				e.click();
//				break;
//			}
//		}
	}
	
	
	
	public  Select getSelect(By Locators)
	{
		return new Select(getElement(Locators));
	}

	public  List<String> getallDropDownOptions(By Locators)
	{
		Select select=new Select(getElement(Locators));
		List<WebElement> optionList=select.getOptions();
		List<String> List=new ArrayList<String>();
		System.out.println(optionList.size());
		
		for(WebElement e: optionList)
		{
			String text=e.getText();
			
			List.add(text);
		}
		return List;
	
		
	}
}
