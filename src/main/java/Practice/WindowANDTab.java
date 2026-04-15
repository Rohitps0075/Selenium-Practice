package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowANDTab {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/");
		String parentID=driver.getWindowHandle();
		String title1=driver.getTitle();
		System.out.println(title1);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		// this will open the new tab and driver will switch to the new tab
		
		// now driver is in new tab 
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.close();// tab will be closed 
		
		// need to switch the control back to parent window
		driver.switchTo().window(parentID);
		
	String parenttitle=	driver.getTitle();
		System.out.println(parenttitle);
		
	}

}
