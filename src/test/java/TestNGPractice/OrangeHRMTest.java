package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class OrangeHRMTest extends BaseTest{

	@Test(priority=1) // for time being i am using priority for below method because it has to launch the url
	public void getPageTitleTest()
	{
		//driver.get("https://www.orangehrm.com/en/30-day-free-trial"); commenting has we are featching the url from the xml
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | HR Software | HRMS | OrangeHRM");
	}
	
	@Test (priority=2)
	public void getPageURLTest()
	{
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("30-day-free-trial"));
	}
	
	
	
	
	
	
}
