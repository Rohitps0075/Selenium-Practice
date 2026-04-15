package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	
	public static void main(String[] args) {
	
		/*
		 * Locators are of 8 types and belogs to By class
		 * 
		 *  id name classname xpath linktesxt partiallinktext tagname css selector
		 */
	
		WebDriver driver =new ChromeDriver();
		
		driver.findElement(By.id("input-email")).sendKeys("rohit");;
		driver.findElement(By.name("password")).sendKeys("Nimi");;
		driver.findElement(By.className("form-control")).sendKeys("Karthika");;
		driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		driver.findElement(By.cssSelector("#column-right > div > a:nth-child(3)"));
		driver.findElement(By.linkText("My Account"));
		driver.findElement(By.partialLinkText("Address"));
		driver.findElement(By.tagName("h2"));
	
		
		
		
		
		
	}
	
	
	
}
