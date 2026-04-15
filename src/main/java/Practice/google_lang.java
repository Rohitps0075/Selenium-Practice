package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_lang {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com");
List<WebElement> lang=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

System.out.println(lang.size());

for(WebElement e: lang)
{
String text=	e.getText();

System.out.println(text);

if(text.equals("ಕನ್ನಡ"))
{
	e.click();
	break;
}






}





	}

}
