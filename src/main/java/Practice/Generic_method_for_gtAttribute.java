package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic_method_for_gtAttribute {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		
		String attvalue=getElementAttribute(firstName, "placeholder");
		System.out.println(attvalue);
		
		
		driver.findElement(lastName).sendKeys("shepur ro");
		
		String attvalue2=getElementAttribute(lastName, "value");
		System.out.println(attvalue2);
		
		
		
		By loginLink=By.linkText("Login");
		
		String hrefValue=getElementAttribute(loginLink, "href");
		System.out.println(hrefValue);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

	public static String getElementAttribute(By Locators, String Value)
	{
		return getElement(Locators).getAttribute(Value);
		
	}
	
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	
	
	
	
	
	
}
