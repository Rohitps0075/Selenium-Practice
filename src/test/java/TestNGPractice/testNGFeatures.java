package TestNGPractice;
/*
 * testNG is unit testing frame work
 * selenium help us to automate the applciateion but we can't do the validations using selenium
 * where in testNG provides different annotations, help for cross browser execution, parallel execution and also provieds Asserts where we can do the validations using asserts
 * 
 * the combination of selenium feature and the testNg features will make a complete UI automation.
 * 
 * to use testNG features we need to do 2 things
 * 1 add the testng dependency in the pom.xml ---> in the depencey you will see <scope> test </scope> tag this means the we can use the testng features only in the src/test/java
 * we need testng features globally means entire project so remove the scope from the xml and hit save.
 * 
 * 2 we need to add the testng plugin --> go to help--install new software--> enter the plugin url(take it from only and don't use latest version)
 * 
 * these 2 setups will help me to access the testNG features.

 */

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGFeatures {
	
	@BeforeSuite
	
	public void connectDB()
	{
		System.out.println("connect to DB");
	}

	@BeforeTest
	public void creatUser()
	{
		System.out.println("user created");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("search test");
	}
	
	@Test
	public void cartTest()
	{
		System.out.println("Cart Test");
	}
	@Test
	public void paymentTest()
	{
		System.out.println("Payment Test");
	}
	@AfterMethod
	public void loggout()
	{
		System.out.println("logg out");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Browser Closed");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("User Deleted");
	}
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("Disconnect DB");
	}
	
	/* the order of execution will be before suite, before test, before class 
	 * and before methods --> this before method will execute before executing each and every test
	 * then Test
	 * aftermethod--- this will execute after executing each and every test
	 * then after class
	 * after test
	 * after suite.
	 * 
	 * here the test will run in the alphabetical order
	 * 
	 * connect to DB
		user created
		Open Browser
		
		Login to application
		Cart Test
		logg out
		
		Login to application
		Payment Test
		logg out
		
		Login to application
		search test
		logg out
		
		Browser Closed
		User Deleted
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
