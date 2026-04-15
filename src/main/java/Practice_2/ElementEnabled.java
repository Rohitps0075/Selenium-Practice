package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabled {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By button=By.xpath("//input[@value='Continue']");
		
		boolean b=driver.findElement(button).isEnabled();
		System.out.println(b);
	}

}
