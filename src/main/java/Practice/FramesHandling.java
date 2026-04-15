package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		
//		driver.switchTo().frame(2);
//		
//		WebElement ele=driver.findElement(By.tagName("h2"));
//		
//		System.out.println(ele.getText());
//	
		
		
//		driver.switchTo().frame("content");
//		WebElement ele1=	driver.findElement(By.tagName("h1"));
//		System.out.println(ele1.getText());
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bot']")));
		WebElement ele3=driver.findElement(By.tagName("h2"));
		System.out.println(ele3.getText());
		
	}

}
