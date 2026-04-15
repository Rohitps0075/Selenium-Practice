package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadow_DOm {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
	String	jspath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
	
	
	// since we are using js path use java script executior
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement ele=(WebElement)js.executeScript(jspath);// cast this js element into webelement

	// now we can use send keys method 
	
	ele.sendKeys("veg pizza");// to enter the value in text field we need to use return keyword in the js path so that value will be enterted.
	
		
	}

}
