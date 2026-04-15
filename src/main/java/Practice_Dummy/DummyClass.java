package Practice_Dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DummyClass {
	WebDriver driver;
public WebElement waitforElement(By locator)
{
	return driver.findElement(locator);
}
	
}
