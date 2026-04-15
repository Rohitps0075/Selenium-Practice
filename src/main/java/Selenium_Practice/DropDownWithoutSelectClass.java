package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By Country=By.xpath("//select[@id='Form_getForm_Country']/option");
		
		List<WebElement> countryDD=driver.findElements(Country);
		
		int totalCountries=countryDD.size();
		System.out.println(totalCountries);
		
		for(WebElement e: countryDD)
		{
			String text=e.getText();
			System.out.println(text);
			
			if(text.contains("India"))
			{
				e.click();
			}
		}
	}

}
