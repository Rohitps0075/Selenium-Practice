package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocator_approach {
	static WebDriver driver;// so we can access driver without creating the object
	
	

	public static void main(String[] args) {

		 driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		//approach 1
//		driver.findElement(By.id("input-email")).sendKeys("Rohit Shepur");
//		driver.findElement(By.id("input-password")).sendKeys("Shepur Rohit");
		
		// approach 2
		
//		WebElement FN=driver.findElement(By.id("input-email"));
//
//		WebElement PW=driver.findElement(By.id("input-password"));
//		
//		FN.sendKeys("Rohit SHepur");
//		PW.sendKeys("Shepur Rohit");
		
		//approach 3
		
//		By firtName=By.id("input-email");
//		By Password=By.id("input-password");
		
//		WebElement FN1=driver.findElement(firtName);
//		WebElement PW1=driver.findElement(Password);
//		
//		FN1.sendKeys("Rohit Nirmala");
//		PW1.sendKeys("Nirmala Rohit");
		
		// approach 4 generic method for webelement
		
//		By firtName=By.id("input-email");
//		By Password=By.id("input-password");
//		
//		WebElement FN2=getElement(firtName);
//		WebElement PW2=getElement(Password);
//		
//		FN2.sendKeys("Rohit Nimi");
//		PW2.sendKeys("NIMI Rohit");
		
		// approach 5 generic method for webelement and action methods(sendkeys 
		
		By firtName=By.id("input-email");
		By Password=By.id("input-password");
		
		doSendKeys(firtName, "Rohit this generic method");
		doSendKeys(Password, "Password1234567");
		
		driver.quit();
		
		// create a eelement util calss for below methods.
		
	}
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	
	public static void doSendKeys(By Locators, String Value)
	{
		getElement(Locators).sendKeys(Value);
	}

}
