package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_text_field_value {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Rohit Shepur Shepur Rohit");
		
		String AttributeValue=driver.findElement(By.id("input-firstname")).getAttribute("value");
		
		System.out.println(AttributeValue);
		
		driver.quit();
		
	}

}
