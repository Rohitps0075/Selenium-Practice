package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsSend {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement ele=driver.findElement(By.cssSelector("#input-firstname"));
		
		String name="Rohit Shepur";
		
		Actions act=new Actions(driver);
		
		
		char[] ch=name.toCharArray();
		
		for(char c:ch)
		{
			act.sendKeys(ele, String.valueOf(c)).pause(200).perform();
		}
		
		
		
		
	}

}
