package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickinfo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.espncricinfo.com/series/sri-lanka-women-tour-of-india-2025-26-1513733/india-women-vs-sri-lanka-women-4th-t20i-1513738/full-scorecard");
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Shafali Verma']/ancestor::td/following-sibling::td//span[text()]")).getText());
	
	
		List<WebElement>list=driver.findElements(By.xpath("//span[text()='Smriti Mandhana']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
	
		for(WebElement e: list)
		{
			String text=e.getText();
			System.out.println(text);
		}
	
		
		
		System.out.println("======== Bowler Details===========");
		System.out.println("======== Bowler Details===========");
		System.out.println("======== Bowler Details===========");
		System.out.println("======== Bowler Details===========");
		
		List<WebElement>details=driver.findElements(By.xpath("//span[text()='Chamari Athapaththu' and contains(@class,'ds-cursor-pointer')]/ancestor::td/following-sibling::td"));
		
		for(WebElement e: details)
		{
			String detailed_text=e.getText();
			System.out.println(detailed_text);
		}
		
	}
}
