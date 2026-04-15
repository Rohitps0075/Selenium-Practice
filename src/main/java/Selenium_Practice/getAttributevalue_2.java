package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributevalue_2 {

	public static void main(String[] args) {

		// enter the text into the text field and featch the value that you entered.
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		
		String atrvalue =driver.findElement(firstName).getAttribute("placeholder");
		
		System.out.println(atrvalue);// this will give the place holder value
		
		
		driver.findElement(firstName).sendKeys("Rohit Shepur");
		
		String atrvalue2=driver.findElement(firstName).getAttribute("value");
		System.out.println(atrvalue2);// this will give the value that we entered in the text field.

	}

}
