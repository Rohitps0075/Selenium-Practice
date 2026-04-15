package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDown_Genaric {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By Country=By.xpath("//select[@id='Form_getForm_Country']");
		
		

		doselectbyIndex(Country, 25);
		
		doselectbyValue(Country, "Germany");
		
		doselectbyVisableText(Country, "India");
		
		System.out.println(getDropDownOptionCount(Country));
		
	}
	public static int getDropDownOptionCount(By Locators)
	{
		Select select=new Select(getElement(Locators));
	List<WebElement>	optionList=select.getOptions();

	return optionList.size();	

	}
	
	public static void doselectbyVisableText(By Locators, String visiableText)
	{
		Select select=new Select(getElement(Locators));
		select.selectByVisibleText(visiableText);
	}
	
	public static void doselectbyValue(By Locators, String value) {
		Select select=new Select(getElement(Locators));
				select.selectByValue(value);
	}
	public static void doselectbyIndex(By Locators, int index)
	{
		Select select=new Select(getElement(Locators));
				select.selectByIndex(index);
	}
	
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}

}
