package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest_Case2 {

	WebDriver driver;
	
	@BeforeMethod
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

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	/*
	 * here we have created 2 Logintest class, in one class we have used BeforeTest and AfterTest
	 * in another class we have used BeforeMethod and AfterMethod
	 * 
	 * the problem with case one is if we are running a 100 test cases at certain point the the browser or app got crashed then all the remaining test cases will be skiped
	 * 
	 * but in case if anything happened between the execution the remaing test case will not be skipped because there will be fresh login aagain
	 * because we have used before method and after method annotaion thses annotations will execute before executing each and every test and after test.
	 * 
	 * 
	 * i am not say case one is not good 
	 * we can use this approach when there is a less naviagation or while doing sanity testing
	 * 
	 * case 2 can be used when there is more navigations or for regression testing.
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
