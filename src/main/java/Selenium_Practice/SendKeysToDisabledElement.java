package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysToDisabledElement {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * when we send the value to disabled element then will get " element not interactable exception"
		 * if we do click action on disabled element, we will not get any exception and it will click.
		 */
		
		
		WebDriver driver=new ChromeDriver();
		
		// for sendkeys
//		
//		driver.get("https://omayo.blogspot.com/");
//		
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("tb2")).sendKeys("Rohit");
		
		
		
		// for click action 
		
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("but1")).click();
		
		
		System.out.println("execution completed");
		
		
		
		
	}

}
