package Practice_Dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DummyClass {
	WebDriver driver;
public List<WebElement> waitforElement(By locator)
{
	return driver.findElements(locator);
}
	
}
