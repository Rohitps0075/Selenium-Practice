package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenricMethodForGetAttribute {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		
		String value1=getElementAttribute(firstName, "placeholder");
		System.out.println(value1);
		
		driver.findElement(firstName).sendKeys("Rohit");
		
		String value2=getElementAttribute(firstName, "value");
		System.out.println(value2);

		
		
		
	}
	
	public static String getElementAttribute(By Locators, String value)
	{
		return getElement(Locators).getAttribute(value);
	}
	
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	
}
