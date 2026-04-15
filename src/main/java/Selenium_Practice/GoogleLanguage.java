package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> languageList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		int languageCount=languageList.size();

		System.out.println(languageCount);
		
		for(WebElement e: languageList)
		{
			String LangText=e.getText();
			System.out.println(LangText);
			
			if(LangText.contains("ಕನ್ನಡ"))
			{
				e.click();
				break;
			}
		}
		
		
		
	}

}
