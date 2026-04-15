package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		
		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']/span"));
		
		int suggestionCount=suggestionList.size();
		System.out.println(suggestionCount);
		
		for(WebElement e:suggestionList)
		{
			String textValue=e.getText();
			System.out.println(textValue);
			if(textValue.contains("testing"))
			{
				e.click();
				break;
			}
		}
	}

}
