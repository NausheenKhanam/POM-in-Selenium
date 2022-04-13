package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowseFactory {
	
	static WebDriver driver;
	public static WebDriver BrowserOptions(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\POMinSelenium\\Browser Jars\\chromedriver.exe");
 
			driver = new ChromeDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\POMinSelenium\\Browser Jars\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
