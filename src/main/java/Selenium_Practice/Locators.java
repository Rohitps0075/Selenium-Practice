package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	
	public static void main(String[] args) {
		
		/*
		 * Locators are used to identify the specifc element on the page
		 * 
		 * locators belongs to by class and all the methods in are static in nature.
		 * 
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By id=By.id("input-lastname");
		
		By tagName=By.tagName("legend");
		
		By className=By.className("form-control");
		
		By Name=By.name("confirm");
		
		By LinkText=By.linkText("Downloads");
		
		By partialLinkText=By.partialLinkText("Reward");
		
		By xPath=By.xpath("//input[@id='input-telephone']");
		
		By cssSelector=By.cssSelector("#input-password");
		
		
		System.out.println(driver.findElement(id).getAttribute("id"));
		
		System.out.println(driver.findElement(tagName).getAttribute("name"));
	
		System.out.println(driver.findElement(className).getAttribute("class"));
		
		System.out.println(driver.findElement(Name).getAttribute("placeholder"));
		
		System.out.println(driver.findElement(LinkText).getText());
		
		System.out.println(driver.findElement(partialLinkText).getText());
		
		System.out.println(driver.findElement(xPath).getAttribute("class"));
		
		System.out.println(driver.findElement(cssSelector).getAttribute("name"));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
