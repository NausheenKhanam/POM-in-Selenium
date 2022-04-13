package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@Test 
	public void TestUser()
	{
		WebDriver driver =  BrowseFactory.BrowserOptions("Chrome","https://opensource-demo.orangehrmlive.com/" );
		LoginPage loginHRM = PageFactory.initElements(driver,  LoginPage.class);
		loginHRM.LoginHRM("Admin", "admin123");
	}

}
