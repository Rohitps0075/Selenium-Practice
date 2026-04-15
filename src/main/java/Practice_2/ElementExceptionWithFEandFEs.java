package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionWithFEandFEs {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email=By.id("input-email");
		By email2=By.id("input-email2");
		
		//driver.findElement(email2);
		
		driver.findElements(email2);
	}

}
