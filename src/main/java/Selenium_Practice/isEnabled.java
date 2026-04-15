package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		By enAbled=By.id("but1");
		By enAbled2=By.id("but2");
		By enAbled3=By.id("but22");
		
		
		boolean b=isElementEnabled(enAbled);
		System.out.println(b);// false
		
		boolean b1=isElementEnabled(enAbled2);
		System.out.println(b1);// true
		
		boolean b2=isElementEnabled(enAbled3);
		System.out.println(b2);// will give catch block output

	}

	
	public static boolean isElementEnabled(By Locators)
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
	
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	
	
	
}
