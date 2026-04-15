package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionWithFEandFEs {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fN=By.id("input-firstname11");
		
		driver.findElement(fN).click();// if element does not found then we will get no such element exception in case of find element method
		
		driver.findElements(fN).size();// if element does not found the we will get empty list in case of find elements.
		
		
	}

}
