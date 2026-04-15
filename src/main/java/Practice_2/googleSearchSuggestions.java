package Practice_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchSuggestions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("naveenautomationlabs");
//		Thread.sleep(2000);
//		
//		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']/span"));
//		
//		System.out.println(suggestionList.size());
//	
//		for(WebElement e: suggestionList)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("javascript"))
//			{
//				e.click();
//				break;
//			}
//		}

		doSearch(By.xpath("//textarea[@id='APjFqb']"), "selenium", By.xpath("//ul/li//div[@class='wM6W7d']/span"), "testing");
		
	}
	

	public static void doSearch(By sendKeysLocators, String Value, By Locators, String suggValue) throws InterruptedException
	{
		getElement(sendKeysLocators).sendKeys(Value);
		Thread.sleep(2000);
		List<WebElement> suggestionList=getElements(Locators);
		System.out.println(suggestionList.size());
		
		//List<String> suggList=new ArrayList<String>();
		
		for(WebElement e: suggestionList)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.contains(suggValue))
			{
				e.click();
				break;
			}
		}
		
	}
	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}
	
	
}
