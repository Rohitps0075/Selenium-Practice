package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributevalues {

	public static void main(String[] args) {
//  print the images SRC value
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> imagesList=driver.findElements(By.tagName("img"));
		
		int img=imagesList.size();
		System.out.println(img);
		
		for(WebElement e: imagesList)
		{
		String value=	e.getAttribute("src");
		System.out.println(value);
		}
		
		// similar capture all the links and print the link text and href values
		
		
		System.out.println("####### capture all the links and print the link text and href values ########");
		
		List<WebElement> listofLinks=driver.findElements(By.tagName("a"));
		
		int links=listofLinks.size();
		System.out.println(links);
		
		for(WebElement e:listofLinks)
		{
			String text=e.getText();
			String value=e.getAttribute("href");

			System.out.println(text+"="+value);
		
		
		}
		
		
		

		
	}

}
