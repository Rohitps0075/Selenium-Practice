package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowTOGetTheOptionWithoutSelectClass {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By country=By.xpath("//select[@id='Form_getForm_Country']/option");

		
	List<WebElement> ddOptions=	driver.findElements(country);
	
	System.out.println(ddOptions.size());
	
	for(WebElement e: ddOptions)
	{
		String text=e.getText();
		System.out.println(text);
		
		if(text.contains("India"))
		{
			e.click();
			break;
		}
		
	}
	
	
	}

}
