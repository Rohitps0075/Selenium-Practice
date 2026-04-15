package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_Links_print_linkText_and_href_value {
public static void main(String[] args) {
	
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	List<WebElement>Totlalinks=driver.findElements(By.tagName("a"));
	
	System.out.println(Totlalinks.size());
	
	
	for(WebElement e:Totlalinks)
	{
		
		String Textvalue=e.getText();
		
		if(Textvalue.length()!=0) {
		
		String Hrefvalue=e.getAttribute("href");
		System.out.println(Textvalue +" = "+Hrefvalue);
		}
		
		
	}
	
	
	
	
}
}
