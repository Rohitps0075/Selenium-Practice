package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	/*
	 * in selenium there is method called isDispalyed() which helps us to verify the element is dispalyed on the page or not.
	 * and also there are some disadvantage with thsi method also let's see them one by one
	 * 
	 */
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email=By.id("input-email");
		By password=By.id("input-password22");
		
		WebElement emailTextField=driver.findElement(email);

//		boolean isElementDispalyed=emailTextField.isDisplayed();// this method will give boolean value
//		System.out.println(isElementDispalyed);
//		// here the output is true
//		/*now let's see the drawback of is dispalyed method
//		 * 
//		 * now i will intenally provide the wrong id that is input-password22 
//		 */
//		WebElement passwordTextField=driver.findElement(password);
//		boolean isPasswordDisplayed=passwordTextField.isDisplayed();
//		System.out.println(isPasswordDisplayed);// the o/p will be no such element exception we need to handle this
//		// that is if the locator is wrong then it will give no such element exception not false value so we need to handle thios one see below genric method
		
		
		// using genaric method
		boolean b1=isElementDisplayed(password);
		boolean b2=isElementDisplayed(email);
		
		System.out.println(b1+"====="+b2);
	
	
	}
	
	public static boolean isElementDisplayed(By Locators)
	{
		try
		{
		return getElement(Locators).isDisplayed();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not displayed");
			return false;
		}
	}

	public static WebElement getElement(By Locators)
	{
		return driver.findElement(Locators);
	}
}
