package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFramehandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//img[contains(@title,'Vehicle-Registration-Forms-and-Examples')]"));
		
		act.click(ele).perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.cssSelector("#RESULT_TextField-1")).sendKeys("Rohit");
		
		driver.findElement(By.cssSelector("#RESULT_TextField-3")).sendKeys("Banglore");
		
		
		driver.switchTo().defaultContent();
		
		String text=driver.findElement(By.cssSelector("#tooltip")).getText();
		System.out.println(text);
		
	}

}
