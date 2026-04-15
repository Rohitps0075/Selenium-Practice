package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementisPresent {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		
		List<WebElement>list=driver.findElements(firstName);
				int count=list.size();
		
				if(count==1)
				{
					System.out.println("Element is present");
				}
				else
				{
					System.out.println(" element id not present");
				}
				driver.quit();
	}

}
