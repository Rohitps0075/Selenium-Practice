package Practice_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextField {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> textFields=driver.findElements(By.tagName("input"));
		
		System.out.println(textFields.size());
		
		for(WebElement e: textFields)
		{
			String placeholder=e.getAttribute("placeholder");
			System.out.println(placeholder);
		}
	}

}
