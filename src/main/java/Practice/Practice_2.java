package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	
		selectuser("Jasmine.Morgan");
	
		System.out.println(getTextofTables("Kevin.Mathews"));
		
	
	}
	
	public static void selectuser(String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getTextofTables(String Values)
	{
		List<WebElement>Right_Side_List=driver.findElements(By.xpath("//a[text()='"+Values+"']/parent::td/following-sibling::td"));
		
		List<String> listlist=new ArrayList<String>();
		
		System.out.println(Right_Side_List.size());
		
		for(WebElement e:Right_Side_List)
		{
			String text=e.getText();
			listlist.add(text);
		}	
		return listlist;
	}
}
