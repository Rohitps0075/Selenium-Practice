package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) {

		String Browser="chrome";
		WebDriver driver=null;
		
		switch (Browser.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Pass the right browser");
			throw new BrowserException("Invalid Browser");	// if we pass wrong browser name then console will dispaly our custom exception.		
			
		}
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
	}

}
