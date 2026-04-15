package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com");

driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("naveen automationlabs");

Thread.sleep(3000);

List<WebElement> suggestion=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']/span"));

System.out.println(suggestion.size());

for(WebElement e:suggestion)
{
	String text=e.getText();
	System.out.println(text);
	
	if(text.contains("youtube"))
	{
		Thread.sleep(3000);
		e.click();
		break;
	}
	
}




		
		
	}

}
