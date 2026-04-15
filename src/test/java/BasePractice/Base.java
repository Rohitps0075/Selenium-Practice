package BasePractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Selenium_Practice.MyException;

public class Base {

	protected WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeTest
	public void setup(@Optional("https://www.google.com") String URL, @Optional("chrome") String Browser)
	//public void setup(String Browser, String URL)
	{

		switch (Browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass the right browser");
			throw new MyException("===== Invalid Browser =====");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);

	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
