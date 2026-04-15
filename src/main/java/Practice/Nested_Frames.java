package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("one");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Two");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Three");
		
		// now driver is in frame 3 so switch from 3 to 2;
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys(" Four");
		
		//switch from 2 to 1
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys(" Five");
		
		// switch out of the frame
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.tagName("h6")).getText());
		
		
		
		// i can switch from
		// 1 to 2
		// 2 to 3
		
		// i can't switch from 
		// 1 to 3
		
		// i can switch back to
		// 3 to 2--parent
		// 2 to 1--parent
		// 3 to main--default
		// 2 to main-- default
		// 1 to main---default
		
		// i can't switch back
		// 3 to 1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
