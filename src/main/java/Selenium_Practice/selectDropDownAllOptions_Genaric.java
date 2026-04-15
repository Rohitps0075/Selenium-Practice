package Selenium_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownAllOptions_Genaric {
static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By country=By.xpath("//select[@id='Form_getForm_Country']");
		
//		List<String> allOptions=getallDropDownOptions(country);
//	
//	for(String e: allOptions) {
//		System.out.println(e);
//	}
	
	System.out.println("###### validate single value########");
	
	if(getallDropDownOptions(country).contains("India"))
	{
		System.out.println("Pass");
	}
	
List<String> collection = Arrays.asList("India", "Germany", "Sri Lanka");

if(getallDropDownOptions(country).containsAll(collection))
{
	System.out.println("Pass");
}
	
	
	
	}
	

	
	public static List<String> getallDropDownOptions(By Locators)
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
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
}
