package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_Elements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		
		By SVG_Path=By.xpath("//*[local-name()='svg' and  @id='map-svg']//*[name()='g' and @id='features']//*[name()='g' and @id='regions']//*[name()='path']");
		
		List<WebElement> allStates=	driver.findElements(SVG_Path);
		
		System.out.println(allStates.size());
		
		for(WebElement e: allStates)
		{
			String state=e.getAttribute("name");
			System.out.println(state);
			
			if(state.equals("New York"))
			{
				e.click();
				break;
			}
		}
		

		
		
		
	}

}
