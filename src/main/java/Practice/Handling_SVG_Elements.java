package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_SVG_Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		
		By SVG_Path=By.xpath("//*[local-name()='svg' and  @id='map-svg']//*[name()='g' and @id='features']//*[name()='path']");
		
		
		List<WebElement> StatesList=driver.findElements(SVG_Path);
		
		System.out.println(StatesList.size());
		
		Actions act=new Actions(driver);
		for(WebElement e: StatesList)
		{
//			act.moveToElement(e).perform();
			String nameOfTheState=e.getAttribute("name");
		
			System.out.println(nameOfTheState);
		}
		
		

		
		
		
		
		
	}

}
