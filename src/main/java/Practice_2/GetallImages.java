package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetallImages {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		// list is order based collection i will follow the order of insertion
		
		System.out.println(images.size());
		
		for(int i=0; i<images.size(); i++)
		{
			String value=images.get(i).getAttribute("src");
			System.out.println(value);
		}
	}

}
