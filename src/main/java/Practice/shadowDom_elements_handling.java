package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDom_elements_handling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");

		String jsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = (WebElement) js.executeScript(jsPath);

		ele.sendKeys("Rohit");

	}

}
