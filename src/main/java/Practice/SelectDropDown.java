package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		WebElement selectdropdown=driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		
		Select select=new Select(selectdropdown);
		
	List<WebElement> opt=select.getOptions();
	
	for(WebElement e:opt)
	{
		System.out.println(e.getText());
	}
		
//		select.selectByVisibleText("India");
//		
//		select.selectByIndex(10);
//		
//		select.selectByValue("Angola");
		
		
		
		
	}

}
