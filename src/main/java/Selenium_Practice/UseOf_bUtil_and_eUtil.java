package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UseOf_bUtil_and_eUtil {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil b=new BrowserUtil();
		WebDriver driver=b.initilize_Browser("Chrome");
		
		b.geturl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		ElementUtil e=new ElementUtil(driver);
		
		By firstName=By.id("input-email");
		By passWord=By.id("input-password");
		By loginButton=By.xpath("//input[@class='btn btn-primary']");
		
		By RegLink=By.linkText("Register");
		
		String text=e.getElementText(RegLink);
		System.out.println(text);
		
		
		e.doSendKeys(firstName, "rohitps@gmail.com");
		e.doSendKeys(passWord, "qwerty");
		
		e.doClick(loginButton);
		
	 Thread.sleep(2000);
	 
	 
	 
		
		b.quitBrowser();

		
	}

}
