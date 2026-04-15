package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenaricForGoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		By searchFiled=By.xpath("//textarea[@id='APjFqb']");
		By SuggestionList=By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		
		doSearch(searchFiled, "Naveen autmationlabs", SuggestionList, "youtube");
		
		

	}

	public static void doSearch(By SearchField, String SearchValue, By SuggestionList, String clickValue) throws InterruptedException
	{
		
	driver.findElement(SearchField)	.sendKeys(SearchValue);
	
	Thread.sleep(2000);
	
	List<WebElement> suggList=driver.findElements(SuggestionList);
	int suggCount=suggList.size();
	System.out.println(suggCount);
	
	for(WebElement e: suggList)
	{
		String text=e.getText();
		System.out.println(text);
		if(text.contains(clickValue))
		{
			e.click();
			break;
		}
	}
		
	}
	
}
