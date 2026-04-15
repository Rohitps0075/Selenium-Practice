package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleWindowHandle {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		
		WebElement ele=driver.findElement(By.linkText("Become a Partner"));
		
		Actions act=new Actions(driver);
		
		act.scrollToElement(ele).perform();
		
				
		ele.click();
		
		// now we need to fecth the id's
		
		Set<String> handles=driver.getWindowHandles();
		// set is non order based collection and doesn't following the index and duplicates are not allowed
		
		// so we need to use iterator , where it help us to featch the values from non order based collection.
		
	Iterator<String>it=handles.iterator();
	
	String parentID=it.next();// usually it is created just above the first segment so we need to move to first segment so we use next() this method will also return the value or id of the page
	System.out.println(parentID);
	String childID=it.next();
	System.out.println(childID);
	
	
// now we can swith to the child page since we have the id's
	
	driver.switchTo().window(childID);
	// now driver switched to child page
	
	String childpageTitle=driver.getTitle();
	System.out.println("Child Page Title is "+ childpageTitle);

	driver.close();// closed the child page
	// now switch the control back to parent
	
	driver.switchTo().window(parentID);
	// now the driver switched back to parent page
	
	String parentpageTitle=driver.getTitle();
	System.out.println("Parent Page Title is "+parentpageTitle);
		
	driver.quit();

	}

}
