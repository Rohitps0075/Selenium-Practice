package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePractice.Base;

public class secondTest extends Base{

	
	@Test
	public void naveenTitle()
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void naveenURL()
	{
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("mationlabs.com/opencart/"));
	}
}
