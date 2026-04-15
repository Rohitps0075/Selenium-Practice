package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	/*
	 * Locators: are used to identify the webelements on the Dom, so that we can do actions on the webelement with the help of locators.
	 * 
	 * there are 8 locators all belogs to By class
	 * id
	 * name
	 * classname
	 * tagname
	 * linkedtext
	 * partical link text
	 * xpath
	 * css 
	 */
	
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		//id-- unique
		driver.findElement(By.id("input-firstname")).sendKeys("Rohit");
		//name
		driver.findElement(By.name("lastname")).sendKeys("Shepur");
		//classname
		driver.findElement(By.className("form-control")).sendKeys("Hello");
		//tagname
		driver.findElement(By.tagName("a"));
		//linked text
		driver.findElement(By.linkText("Register")).click();
		//partical link text
		driver.findElement(By.partialLinkText("Recurring")).click();
		//xpath-- adsress of the webelement in the dom
		driver.findElement(By.xpath("//input[@id='input-password']"));
		//css
		driver.findElement(By.cssSelector("#input-confirm"));
		
		driver.quit();
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
