package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rohit");
		
		//driver.findElement(By.xpath("//input[@id='input-email11']")).sendKeys("rohit");// if syntex is correct but there is mistake in the xpath then we will get No such element exception
		
		
		driver.findElement(By.xpath("//input@id='input-email'//div")).sendKeys("rohit");// if syntex is worng then we will get invalid selector exception
	}
}
