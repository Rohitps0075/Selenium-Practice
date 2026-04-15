package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguages {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		
		List<WebElement> lang=driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		
		System.out.println(lang.size());
		
		for(WebElement e: lang)
		{
			String langText=e.getText();
			System.out.println(langText);
			if(langText.contains("ಕನ್ನಡ"))
			{
				e.click();
				break;
			}
		}
		
		
	}

}
