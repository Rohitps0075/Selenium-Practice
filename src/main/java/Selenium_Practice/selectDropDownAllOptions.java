package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownAllOptions {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By country=By.xpath("//select[@id='Form_getForm_Country']");
		WebElement countryDropDown=driver.findElement(country);
		
		Select select=new Select(countryDropDown);
		
		List<WebElement> dropdownOption=select.getOptions();
		int alloptionCount=dropdownOption.size();
		System.out.println(alloptionCount);
		
		for(WebElement e: dropdownOption)
		{
			String optionTextValue=e.getText();
			System.out.println(optionTextValue);
		
		}
	
	
	
	
	}

}
