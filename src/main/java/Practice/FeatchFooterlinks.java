package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeatchFooterlinks {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerLinks=By.xpath("/html/body/footer/div/div//a");
		
		int count=getElementCount(footerLinks);
		System.out.println(count);
		System.out.println("======================");
		printElementTextValue(footerLinks);
		
		System.out.println("all links got printed");
		
		driver.quit();
		
	}

	
	public static List<WebElement> getElements(By Locators)
	{
		return driver.findElements(Locators);
	}
	
	public static int getElementCount(By Locators)
	{
		return getElements(Locators).size();
	}
	
	public static List<String> getElementTextvalue(By Locators)
	{
		List<WebElement> ele=getElements(Locators);
		List<String> ele2=new ArrayList<String>();
		for(WebElement e:ele)
		{
			String textValue=e.getText();
			
			if(textValue.length()!=0)
			{
				ele2.add(textValue);
			}
		}
		return ele2;
	}
	public static void printElementTextValue(By Locators)
	{
		List<String> text_text=getElementTextvalue(Locators);
	
		for(String e:text_text)
		{
			System.out.println(e);
		}
	}
	
}
