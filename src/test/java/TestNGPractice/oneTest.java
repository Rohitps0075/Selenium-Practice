package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePractice.Base;

public class oneTest extends Base{
	
	@Test
	public void googleTitle()
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, "Google");
	}

	@Test
	public void googleURL()
	{
		String actualURL=driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("google."));
	}
	
	
	
	
}
