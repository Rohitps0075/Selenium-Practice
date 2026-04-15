package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullwithSendKeys {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		/*
		 * when we send null value then we will get illageal arugument exception
		 * 
		 * here i am writing the generic method directly
		 */
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By FN=By.id("input-firstname");
		
		// commenting the below to run sendkeys with charsequeence (// this will throw an illagel argument exception)
		
		//dosendKeys(FN, null);
		
		/*
		 * send keys method will accept both the string value as well as charsequesnce value see the below example
		 */
		String s1="Rohit";
		StringBuffer s2=new StringBuffer("Nimi");
		StringBuilder s3=new StringBuilder("Karthik");
		
		dosendkeys(FN, s1,s2,s3);
		
		
	
	}
	
	/*
	 * adding below send keys method to element util and this is overloaded method.
	 */
	public static void dosendKeys(By Locators, String value)
	{
		getElement(Locators).sendKeys(value);
	}
	
	public static void dosendkeys(By Locators, CharSequence...value)
	{
		getElement(Locators).sendKeys(value);
	}
	
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}

}
