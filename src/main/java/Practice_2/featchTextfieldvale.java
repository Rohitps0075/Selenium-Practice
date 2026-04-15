package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class featchTextfieldvale {
static WebDriver driver;
	public static void main(String[] args) {
	 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Rohit Shepur");
		
		
//		String value=driver.findElement(By.xpath("//input[@id='input-firstname']")).getAttribute("value");
//		System.out.println(value);
		
		System.out.println(getElementAttribute(By.xpath("//input[@id='input-firstname']"), "value"));
		
	}
	
	public static String getElementAttribute(By Locators, String attributename)
	{
		return getElement(Locators).getAttribute(attributename);
	}
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}

}
