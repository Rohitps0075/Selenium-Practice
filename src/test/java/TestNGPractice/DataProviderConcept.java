package TestNGPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;

public class DataProviderConcept extends BaseTest {

	// return type of data provider is 2 diomantioal object array

	@DataProvider
	public Object[][] registerFormDetails() {

		return new Object[][] {

				{ "RohitR" , "ShepurS" ,"ROHITSHEPURS0099@gamil.com" 
			, "9876543211", "yterwq" , "yterwq" , "Your Account Has Been Created!" } 
				};

	}

	@Test(dataProvider = "registerFormDetails")
	public void registerFormTest(String firstName, String lastName, String eMail, String telePhone, String passWord,String confirmPassword, String expectedHeader)
	{
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(eMail);
		driver.findElement(By.id("input-telephone")).sendKeys(telePhone);
		driver.findElement(By.id("input-password")).sendKeys(passWord);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actualHeader = driver.findElement(By.tagName("h1")).getText();
		System.out.println(actualHeader);
		Assert.assertEquals(actualHeader, expectedHeader);

	}

}
