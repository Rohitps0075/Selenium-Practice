package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		By radio=By.id("radio1");
		By radio2=By.id("radio22");
		
		ElementUtil e=new ElementUtil(driver);
		
		driver.findElement(radio).click();
		
	boolean b=	isElementSelected(radio);
		System.out.println(b);
		
		
	boolean b1=isElementSelected(radio2);
		System.out.println(b1);// will give false
		
		

	}
	
	public static boolean isElementSelected(By Locators)
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
	
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}

}
