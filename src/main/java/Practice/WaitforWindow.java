package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforWindow {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);

		// number of windows to be will give the boolean value
		// this method will not switch , we need to switch to child with regular
		// process.

		// since this method return the boolean value we need to use try catch block

	}

	public static boolean waitforWindows(int timeouts, int noofwindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));

		try {
			return wait.until(ExpectedConditions.numberOfWindowsToBe(noofwindows));
		} catch (TimeoutException e) {
			System.out.println("please pass the correct window value");
			return false;
		}
	}

}
