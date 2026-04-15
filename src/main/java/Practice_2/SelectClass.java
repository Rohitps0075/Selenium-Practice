package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='drop1']"));

		Select select=new Select(ele);
		
		select.selectByIndex(2);
		
		Thread.sleep(3000);
		
	}

}
