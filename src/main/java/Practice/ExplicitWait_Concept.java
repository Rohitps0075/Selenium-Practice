package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Concept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.xpath("//input[@id='input-email']");
		By password = By.xpath("//input[@id='input-password']");
		By login = By.xpath("//input[@type='submit']");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// WebElement
		// ele_email=wait.until(ExpectedConditions.presenceOfElementLocated(email));
		// the return type of presence of element located is webelement

		// ele_email.sendKeys("rohitps@gmail.com");
		presenceofElement(10, email).sendKeys("rohitps@gmail.com");

		driver.findElement(password).sendKeys("qwerty");

		driver.findElement(login).click();

	}

	public static WebElement presenceofElement(int timeouts, By Locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));

		// this method will return the webelement by applying the wait
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		// this method will return the webelement without apllying the wait.

	}

	// here the webdriver wait will wait for 10 sec if element not found witin 10
	// sec then we will get no such element exceptiona dnalso timeout exception
	// what is ment by presence of element located
	// this method will check wheater the element is present on the dom or not ,
	// this method will not care wheater the element is visbil on the web page or
	// not
	// so we have to use element visiblilty method insted of pressence of element
	// method.

	public static WebElement visiblityofElement(int timeouts, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		// this method will return the webelement by applying the wait.
		// what is ment by visiblity of element located.
		// this method will check wheather the element is presenet in the dom and also
		// also make sure that the element is visiblie of the webpage,
		// height and width should be >0
	}

	// diffrence between presence and visibility of element located.
	// presence will make sure wheather the element is present in the dom or not and
	// does not care wheather the elelement is visible on the page or not
	// visibility will make sure the element is presenet on the dom and also visible
	// on the webpage, visiblity means the height and width shlod be >0.

	public static void doclick(int timeouts, By Locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator)).click();
	}

	public static void sendkeys(int timeouts, By locator, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
	}

	// what happens when we use both implicit and explict wait together
	// ans: total time will be increased, what if the implict wait says the element
	// not found and explict wait says that the element is found so we should use
	// both at a time.

	// polling period

	// when we run the script which contains explicit wait, the request will be sent
	// to server from server to browser.
	// if the element is not found the explicit wait wait for 500MS and after 500MS
	// again the request will be sent to server from server to browser
	// the time diffrence between one request to another request is called polling
	// period, or interval or sleep time.
	// here we have specified the 10 sec here 20 times request will be sent.

	public static WebElement presenceofElement(int timeouts, int intervalTime, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts), Duration.ofSeconds(intervalTime));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		// this method will return webelement with wait and with custome sleep period or
		// polling period.
		// this will check the element in dom doesn't bouther about the visiblilty of
		// element on the page
	}

	public static WebElement visibilityofElement(int timeouts, int sleepTime, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts), Duration.ofSeconds(sleepTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		// this method return the webelement by applying wait and sleep period
		// this method will check the element in dom and page
		// visibility means height and width should be >0

	}

	public static void waitforElementandClick(int timeouts, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		// this method will check the element is enabled, visible and do the click
		// action

	}

	// wait for elements

	public static List<WebElement> waitforPresenceofElements(int timeouts, By locators) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locators));

		// presence of all element located by
		// this method will check atleast one of the element is visibile on the web page
		// will return the list of webelements
	}

	public static List<WebElement> waitforvisibilityofElements(int timeouts, By locators) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locators));
		// this method will return list of web element
		// this method will check the all elements are visible on the webpage.
	}

}
