package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LoginTest_With_Using_BaseTest extends BaseTest{
	

	@Test(priority=1) // for time being i am using priority for below method because it has to launch the url
	public void pageTitleTest()
	{
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");// for time being i am passing the url from the test method only
		//commenting has we are featching the url from the xml
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test(priority=2)
	public void pageURLTest()
	{
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("opencart/index.php?"));
	}
	
	@Test (priority=3)
	public void cartTest()
	{
		WebElement actualEle=driver.findElement(By.cssSelector("button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle"));
		Assert.assertTrue(actualEle.isDisplayed());
		
	}

	/*
	 * here we are extending the properties from base class (parent) to login Test class(child)
	 * 
	 * driver is extended from the base class
	 * 
	 * when i run this class the browser launch with the help of setup in base class and also close of browser will be done by the tearDown methods from the base class
	 */

	/*now i am going to each and every test class and running the script i want to run all the test at time lets see with the help of testNG.xml which is called as runner
	 * 
	 * how to create
	 * 
	 * since the testng.xml is non java related file so should not create them in the src/test/java or src/main/java
	 * 
	 * we need to creat a seprate folder for these
	 * 
	 * right click on project-->source folder--> give name src/test/resources --> then right click on the folder --new-- folder--testRunner---then right click on the folder
	 * --new-- file--- create testNG.xml file
	 * 
	 * 
	 * 
	 */
}
