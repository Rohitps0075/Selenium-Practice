package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		// launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		// enter url
		driver.get("https://www.google.com");
		
		// to get page title
		String title=driver.getTitle();
		System.out.println(title);
		
		// to get page url
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		// to close the browser
		driver.quit();
		
		
		
		
	}

}
