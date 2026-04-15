package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Text_Fields {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> totlaNoofTextFields=driver.findElements(By.className("form-control"));
		
		
		int count=totlaNoofTextFields.size();
	
		System.out.println(count);
		
		
		for(WebElement e:totlaNoofTextFields)
		{
			String PlaceholderName=e.getAttribute("placeholder");
		System.out.println(PlaceholderName);
		}
		
		driver.quit();
	}

}
