package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		String parentID=driver.getWindowHandle();
		
		WebElement Become_a_Partner=driver.findElement(By.linkText("Become a Partner"));
		WebElement Press_Releases=driver.findElement(By.linkText("Press Releases"));
		WebElement HR_Dictionary=driver.findElement(By.linkText("HR Dictionary"));
		WebElement General_Public_License=driver.findElement(By.linkText("General Public License"));
		
		Actions act=new Actions(driver);
		
		act.click(Become_a_Partner).perform();
		act.click(Press_Releases).perform();
		act.click(HR_Dictionary).perform();
		act.click(General_Public_License).perform();
		
		// now we need to fetch the id's
		
		Set<String> handles=driver.getWindowHandles();
		// set is non order based collection and doesnot follow the index and doesnot alllow the duplicates so we need to use iterator so iterators will help us to featch the values from the non index based collection.
		
		
		Iterator<String> it=handles.iterator();
		
		// in previous example we dirsctly used that it.next() because in that example we have only 2 windows so there is no that confusion , we can easly fetch parent and child id's
		// but in this example we have opened multiple windows and we are sure which window is in which position/index so we have use hasnext() this will check wheathere there is windown avaliable next or not
		
		while(it.hasNext())// has next method will check wheater ther is window avilabel or not, return boolean value.
		{
			String windowID=it.next();// this will move the it to the first segment since it is created just above the 1st segment
			driver.switchTo().window(windowID);//switch to the child page
			System.out.println(driver.getTitle());// get title of the child page 
			
			if(!windowID.equals(parentID))// means if window id is not equal to parent id then close the window.
			{
			driver.close();// close the child page.
			}
			
		// the problem with this code is it will fetch all the child titles and close the child title but parent page will also get closed so we need to fix the issue.
			
			
		}
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
