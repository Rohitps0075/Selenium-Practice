package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {


		 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email")).sendKeys(null);
		
		// will give illagale argument exception
		
		//sendkeys is a overload method we can send the string and also char sequesce
		// char sequesce is an interface provided by java
		
		String name="Rohit ";
		
		StringBuffer name1=new StringBuffer("Nirmala ");
		
		StringBuilder name2=new StringBuilder("Shepur ");
		
//		driver.findElement(By.id("input-email")).sendKeys(name, name1,name2);
		
		doSendkeys(By.id("input-email"), name,name1,name2);
		
	}
	
	
	public static void doSendkeys(By Locators, CharSequence...value)
	{
		getElement(Locators).sendKeys(value);
	}

	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
}
