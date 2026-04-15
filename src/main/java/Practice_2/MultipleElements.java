package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));

		//list is order based colection it allows duplicates and follow the order
		
		int totallinks=list.size();
		System.out.println(totallinks);
		
		for(int i=0; i<totallinks; i++)
		{
			String name=list.get(i).getText();
			
			if(name.length()!=0)// this will elimate the bank text links
			{
				System.out.println(i+"="+name);
			}
			
			
		}
		
		
		System.out.println("===================== for each loop ===================");
		
		for(WebElement e: list)
		{
			String name=e.getText();
			if(name.length()!=0)
			{
				System.out.println(name);
			}
		}
		
		System.out.println("===================== for each loop 2 ===================");
		
		int count=0;
		
		for(WebElement e:list)
		{
			String name=e.getText();
			
			if(name.length()!=0)
			{
				System.out.println(count+"="+name);	
			}
			count++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
