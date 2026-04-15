package Practice_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
			
//		driver.get("https://www.google.com");
//		
//		driver.quit();
//		System.out.println(driver.getTitle());
		
		// here we will get no such session exception because session id is null
		// when we try to to any action after driver.quit method we will get no such session exception because session id is null
		
		driver.get("https://www.google.com");
		
		driver.close();
		System.out.println(driver.getTitle());
		// here we will get no such session exception because the session id is invalid
		// when we try to do any action after the close methods then we will get no such session exception because the session id is invalid.
		
		
		

		
		
		
		
		
		
		
	}

}
