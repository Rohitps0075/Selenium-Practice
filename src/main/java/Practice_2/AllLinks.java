package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
// capture all the links and and print the link text and href value
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		

		int count =0;
		for(WebElement e: allLinks)
		{
			String linkText=e.getText();
			String hrefValue=e.getAttribute("href");
			
			if(linkText.length()!=0)
			{
				System.out.println(count+"==>"+linkText+"==>"+hrefValue);
			}
			count++;
		}
		
		
		
		
		
	}

}
