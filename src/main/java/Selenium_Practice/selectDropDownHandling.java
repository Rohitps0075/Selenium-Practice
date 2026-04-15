package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownHandling {

	public static void main(String[] args) throws InterruptedException {


		// when there is select tag then we have to use select class 
		// select class will work only for the select tags
		// for select class we have to pass the webelement
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		By countryDD=By.xpath("//select[@id='country']");
		WebElement countryDropDown=driver.findElement(countryDD);
		
		Thread.sleep(2000);
		Select select=new Select(countryDropDown);
		
		List<WebElement>allOptions=select.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement e:allOptions)
		{
			String optionText=e.getText();
			System.out.println(optionText);
		}
		//select.selectByIndex(5);
		
		
		//select.selectByVisibleText("India");
		
		
		select.selectByValue("japan");
		driver.quit();
		
	}

}
