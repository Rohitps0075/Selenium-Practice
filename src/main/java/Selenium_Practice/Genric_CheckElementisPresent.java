package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genric_CheckElementisPresent {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	By firstName=	By.id("input-firstname");
	By rihtPanelLinks=By.xpath("//div[@class='list-group']/a");
	By LoginButton=	By.xpath("//input[@value='Login']");
	By wishList=By.xpath("//a[text()='Wish List']");

	boolean b1=isElementPresent(firstName);
	System.out.println(b1);
	
	boolean b2=isElementPresent(rihtPanelLinks, 13);
	System.out.println(b2);
	
	boolean b3=isElementNotPresent(LoginButton);
	System.out.println(b3);
	
	boolean b4=isElementMultiplePresent(wishList);
	System.out.println(b4);


	}
	
	public static boolean isElementMultiplePresent(By Locators)
	{
		if(getElementCounts(Locators)>1)
		{
			return true;
		}
		return false;
	}
	public static boolean isElementNotPresent(By Locators)
	{
		if(getElementCounts(Locators)==0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isElementPresent(By Locators, int ExpectedCount)
	{
		if(getElementCounts(Locators)==ExpectedCount)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isElementPresent(By Locators)
	{
		if(getElementCounts(Locators)==1)
		{
			return true;
		}
		return false;
	}
	
	
	public static int getElementCounts(By Locators)
	{
		return getElements(Locators).size();
	}
	
	
	
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}

}
