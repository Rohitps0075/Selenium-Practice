package Practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demo {

	public static void main(String[] args) {
		BrowserUtil_2 bU=new BrowserUtil_2();
		
		WebDriver driver=bU.initilzeBrowser("Chrome");
		bU.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eu=new ElementUtil(driver);
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		By Login=By.xpath("//input[@value='Login']");
				
				eu.doSendKeys(email, "rohitps@gmail.com");
		eu.doSendKeys(password, "qwerty");
		eu.doClick(Login);
		
		
		
		
		
	}

}
