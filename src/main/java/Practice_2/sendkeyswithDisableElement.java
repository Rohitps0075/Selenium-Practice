package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeyswithDisableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(4000);
		
		
		//driver.findElement(By.id("tb2")).sendKeys("Rohit");
		
		// when we try to send the values to the disabled element we will get element not interactable exception 

		// similarly when we try to click on disable element we not get any exceptiona and ther will be no click also
		
		driver.findElement(By.id("but1")).click();
		
	}

}
