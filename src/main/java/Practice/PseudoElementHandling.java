package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String path="return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"),'::before').getPropertyValue('content')";
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String value=js.executeScript(path).toString();
		System.out.println(value);
		
		
		
		
		
	}

}
