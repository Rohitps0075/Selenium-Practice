package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_Search {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		/*
		 * let write a normal flow
		 */
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// lets make below commented code to generic code.
		
//		WebElement ele=driver.findElement(By.name("q"));
//		
//		ele.sendKeys("selenium");
//		Thread.sleep(3000);
//		
//		List<WebElement> eleList=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']/span"));
//		
//		int countofSugession=eleList.size();
//		System.out.println(countofSugession);
//		
//		for(WebElement e:eleList)
//		{
//			String Text=e.getText();
//			System.out.println(Text);
//			if(Text.contains("questions"))
//			{
//				e.click();
//				break;
//			}
//		}

		By SearchField=By.name("q");
		By Sugessions=By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		doSearch(SearchField, "rohit sharma", Sugessions, "wife");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	public static void doSearch(By SearchField,String SearchKey, By Sugessions, String MatchValue) throws InterruptedException
	{
		WebElement ele=driver.findElement(SearchField);
		
		ele.sendKeys(SearchKey);
		Thread.sleep(3000);
		
		List<WebElement> eleList=driver.findElements(Sugessions);
		
		int countofSugession=eleList.size();
		System.out.println(countofSugession);
		
		for(WebElement e:eleList)
		{
			String Text=e.getText();
			System.out.println(Text);
			if(Text.contains(MatchValue))
			{
				e.click();
				break;
			}
		}
	}

}
