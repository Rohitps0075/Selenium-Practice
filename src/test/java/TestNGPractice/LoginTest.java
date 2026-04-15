package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void pageTitleTest()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void pageURLTest()
	{
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("opencart/index.php?"));
	}
	
	@Test
	public void cartTest()
	{
		WebElement actualEle=driver.findElement(By.cssSelector("button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle"));
		Assert.assertTrue(actualEle.isDisplayed());
		
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
 /*we have created 3 test insted of 1 test method because accounding ti AAA patter for unit testing 
  * each and every should have only one assert
  * and each and ervey test should be independent.
  * 
  * 
  */

	}


