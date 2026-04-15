package TestNGPractice;

import org.testng.annotations.Test;

public class exceptExceptions {

	
	@Test(expectedExceptions = ArithmeticException.class)
	public void searchTest()
	{
		System.out.println("Search Test");
		int i=9/0;
	}
	
	@Test(invocationCount=10)
	public void paymentTest()
	{
		System.out.println("Payment test");
	}
	
	/*
	 * here i am write 9/0 which gives arithmatic exceptions 
	 * so we have a fatures like expectedExceptions which will take string value so we are telling that this method will give exeception 
	 * so the testng will pass this particulr methods
	 * note this is not exception handling
	 * 
	 * 
	 * 
	 * we have invocationCount in testng when ever we want to run the same test case multiple then we can use invocationCount 
	 */
}
