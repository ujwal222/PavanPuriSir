package String;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class a10 {

	//cross browser testing
	@Test
	@Parameters("browser")
	public void browserLaunch(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver2.exe");
			WebDriver driver = new ChromeDriver ();
		
			driver.get("https://www.google.co.in/");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{

			System.setProperty("webdriver.edge.driver", "D:\\Chrome\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver ();
			driver.get("https://www.google.co.in/");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "D:\\Chrome\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver ();
			driver.get("https://www.google.co.in/");
		}
	}
}
