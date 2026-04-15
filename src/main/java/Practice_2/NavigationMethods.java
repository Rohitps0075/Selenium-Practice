package Practice_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
/*
 * we have forword, back, refresh() and to()
 */
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		driver.get("https://www.naveenautomationlabs.com");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	
	
	
}
