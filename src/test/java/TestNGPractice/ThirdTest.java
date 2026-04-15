package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePractice.Base;

public class ThirdTest extends Base {

	@Test
	public void orangeTitle()
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, "Sign up for OrangeHRM Free Trial | OrangeHRM");
	}
	
	@Test
	public void orangeURL()
	{
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("/30-day-free-trial"));
	}
	
	
}
