package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {


		 driver=new ChromeDriver();
			
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");
		By passWord=By.id("input-password");
		By login=By.xpath("//input[@value='Login']");
		
//		getElement(email).sendKeys("RohitShepur");
//		getElement(passWord).sendKeys("shepurRohit");
		
		doSendKeys(email, "Rohitshepur");
		doSendKeys(passWord, "ShepurRohit");
		getElement(login).click();
	}

	public static void doSendKeys(By Locator, String value)
	{
		getElement(Locator).sendKeys(value);
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	
}
