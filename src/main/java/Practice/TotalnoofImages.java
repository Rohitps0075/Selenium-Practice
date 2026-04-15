package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalnoofImages {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		int image_count=images.size();
		System.out.println(image_count);
		
		for(WebElement e:images)
		{
			String AttributeValue=e.getAttribute("src");
		System.out.println(AttributeValue);
		}
		
	}

}
