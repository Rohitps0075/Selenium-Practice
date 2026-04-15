package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitforFrames {

	static WebDriver driver;
	public static void main(String[] args) {


		 driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

		//waitforFrameByIndex(10, 0);
		//waitforFrameByIdorName(10, "mce_0_ifr");
		//waitforFrameByLocator(10, By.xpath("//iframe[@title='Rich Text Area']"));
		waitforFrameByWebElement(10, By.cssSelector(".tox-edit-area__iframe"));
		String text=driver.findElement(By.id("tinymce")).getText();
		System.out.println(text);
		driver.quit();
	}

	
	public static void waitforFrameByIndex(int timeouts, int index)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public static void waitforFrameByIdorName(int timeouts, String iDorName)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iDorName));
	}
	
	public static void waitforFrameByWebElement(int timeouts, By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(locator)));
	}
	
	public static void waitforFrameByLocator(int timeouts, By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	
	
	
	
	
}
