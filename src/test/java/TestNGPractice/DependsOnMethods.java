package TestNGPractice;

import org.testng.annotations.Test;

public class DependsOnMethods {

	
	@Test(dependsOnMethods="searchTest")
	public void paymentTest()
	{
		System.out.println("payment Test");
	}
	
	@Test 
	public void searchTest()
	{
		System.out.println("search Test");
	}

/*
 * using depends on methods is also not a good practice because if one test failes other test will be skipped.
 * 
 */

}

