package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
//		List<WebElement> options=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		
//		System.out.println(options.size());
//		
//		
//		for(WebElement e: options)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}
//		
		By optionlist= By.xpath("//select[@id='Form_getForm_Country']/option");
		
		withoutSelect(optionlist, "India");
		
		
	}
	
	
	
	
	public static List<WebElement> getElements(By Locators)

	{
		return driver.findElements(Locators);
	}
	
	public static void withoutSelect(By Locators, String value)
	{
	List<WebElement> option=	getElements(Locators);
	System.out.println(option.size());
	
	for(WebElement e:option)
	{
		String text=e.getText();
		System.out.println(text);
		if(text.equals(value))
		{
			e.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
