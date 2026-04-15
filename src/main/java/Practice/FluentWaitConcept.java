package Practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		// we have wait interface this has a until abstract method
		// fluent wait is a class which implements wait interface and override until methods and also have some indivisual methods
		//webdriver wait is a class which extends fluent wait class and this class doen't have any methods.
		
		
		Wait <WebDriver>wait=new FluentWait<WebDriver> (driver)
							.withTimeout(Duration.ofSeconds(10))
							.pollingEvery(Duration.ofSeconds(2))
							.ignoring(NoSuchElementException.class)
							.withMessage(" element is not found");
		// here <WebDriver> ---Input type
		// (driver)---on which entity we are applying the fluent wait.
		
		
		
		// when we try to access the same with wait. we will able to access because we are trying to access the indivisaul methods of fluent wait(refernce typr check)
		// we can only access the oveeriden method that is until method
		
		

	//	what is the diffrence b/w fluent and webdriver wait
		// there is no diffrence they both are exactly same
		// in how webdriver wait is child of fluent wait.
		
		
		// why webdriver wait is given with no methods we can directly use fluent wait only right?
		// generally we prefrence to create the object at the lowest level
		// so here webdriver wait has all the features of fluent wait if incase if we need to design our own custome wait then webdriver wait will help us.
		
		
		
		
		
		
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver) 
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(2))
								.ignoring(NoAlertPresentException.class)
								.withMessage("hello");
		
		//<Webdriver>---input type
		//(driver)--->on which entity we are applying the fluent wait.
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
