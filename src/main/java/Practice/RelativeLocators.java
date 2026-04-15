package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// //p[text()='Mont Laurier']
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.aqi.in/dashboard/canada");
//		
//		Thread.sleep(20000);
//		
//		WebElement ele=driver.findElement(By.xpath("//p[text()='Mont Laurier']"));
//		
//		String text=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(text);
//		String text1=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(text1);
//		String text2=driver.findElement(with(By.tagName("p")).above(ele)).getText();
//		System.out.println(text2);
//		
//		String text3=driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(text3);
//		
//		String text4=driver.findElement(with(By.tagName("p")).near(ele)).getText();
//		System.out.println(text4);
		
		
		//example:2
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emaillable=driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		WebElement Pwdlable=driver.findElement(By.xpath("//label[text()='Password']"));

	//driver.findElement(with(By.id("input-email")).below(emaillable)).sendKeys("Rohit");
	
	// we can wirte below like also
	
	driver.findElement(with(By.id("input-email")).above(Pwdlable)).sendKeys("Rohit shepur");
	
	
	
	}

}
