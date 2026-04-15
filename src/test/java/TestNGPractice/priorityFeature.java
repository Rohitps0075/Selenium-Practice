package TestNGPractice;

import org.testng.annotations.Test;

public class priorityFeature {

	
	@Test(priority=2)
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	
	@Test(priority=1)
	public void cartTest()
	{
		System.out.println("Cart Test");
	}
	
	@Test(priority=0)
	public void paymentTest()
	{
		System.out.println("Payment Test");
	}
	
	/*
	 * i have to prioritozed the test methods so order of execution will be in alphabetical order
	 * 
	 * now i have provided the priority so the order of execution will be 1,2,3 
	 * 
	 * priority will take the int value 
	 * the max priority value is max of int --Integer.MAX_VALUE
	 * and the min priority is min of int--Integer.MIN_VALUE
	 * 
	 * 
	 * we can give -ve priority also
	 * if we have same priority for multiple methods then order of execution will be alphabetical order
	 * 
	 *  if we have priority for some methods and for some methods there is no priority, in that case first non priority methods will run alphabetically and 
	 *  after that priority methods will execute.
	 *  
	 *  
	 *  
	 *  there is no rule that we have to give priority values in sequesnce like 1 2 3 4 5 
	 *  we can give like 3 11 53 87 also
	 *  
	 *  
	 *  
	 *  
	 *  using priority is not a good practice
	 *  because i have 3 test cases and i have provided the priority
	 *  if test case with priority 1 got failed may be due to some browser crash or app crash
	 *  then other 2 cases will be skiped 
	 *  and we should follow the AAA pattern in unit testing 
	 *  arrange act assert
	 *  
	 *  as per this we should create dependencey beteen the methods each and every emthods be independent.
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
