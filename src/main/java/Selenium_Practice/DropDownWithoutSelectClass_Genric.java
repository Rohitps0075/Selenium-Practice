package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectClass_Genric {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By Country=By.xpath("//select[@id='Form_getForm_Country']/option");
		By Country1=By.xpath("//select[@id='Form_getForm_Country']");
		
		//selectDropDownValue(Country, "Germany");
		selectDropDownvalueUsingSelect(Country1, "India");
	}

	
	public static void selectDropDown(List<WebElement> optionList, String value) {
		
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
	
	public static void selectDropDownValue(By Locators, String value)
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
	public static void selectDropDownvalueUsingSelect(By Locators, String value)
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
	
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	
	public static Select getSelect(By Locators)
	{
		return new Select(getElement(Locators));
	}
}
