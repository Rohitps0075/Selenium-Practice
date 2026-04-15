package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforAlert {

	static WebDriver driver;
	public static void main(String[] args) {

		 driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());

	System.out.println(	alert.getText());
	
	alert.accept();
	
	// alertispresent()-- this method not only check the alert is preseent or not but also switch to the alert.	
	}
	
	public static Alert alertIsPresent(int timeouts)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeouts)
	{
		return alertIsPresent(timeouts).getText();
	}

	public static void acceptTheAlert(int timeouts)
	{
		alertIsPresent(timeouts).accept();
	}
	
	public static void dissmisTheAlert(int timeouts)
	{
		alertIsPresent(timeouts).dismiss();
	}
	
	public static void sendValuesToPrompt(int timeouts, String value)
	{
		alertIsPresent(timeouts).sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
