package Practice_2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class differencebetweenGetandTo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {


		/*
		 * there is no diffrence between get and close method
		 * the to method internally use get method only
		 * using get method alos we can do bac and forword action 
		 * 
		 * he only difference is that the to method is overloaded method
		 * to(passs the url)
		 * to(url type of url
		 */
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to(new URL("https://www.naveenautomationlabs.com"));
		
		
		
		
		
	}

}
