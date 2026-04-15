package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllTextofLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		int listSize=	list.size();
		
		System.out.println(listSize);
		
		for(int i=0; i<listSize;i++)
		{
			String text=list.get(i).getText();
			
			System.out.println(i+"="+text);
		}
		
		System.out.println("###### will print only links that have text value #####");
		
		for(int i=0; i<listSize; i++)
		{
			String text=list.get(i).getText();
		
			if(text.length()!=0)
			{
				System.out.println(i+"="+text);
			}
		}
		System.out.println("##### for each loop all links #####");
		int count2=0;
		for(WebElement e: list) {
			String text=e.getText();
			System.out.println(count2+":"+text);
			count2++;
		}
		
		
		System.out.println("##### for each loop only links with text value #####");
		int count=0;
		for(WebElement e: list)
		{
			String text=e.getText();
			if(text.length()!=0)
			{
				System.out.println(count+":"+text);
			}
			count++;
		}
	}

}
