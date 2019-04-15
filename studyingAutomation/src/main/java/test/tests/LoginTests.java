package test.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import support.Connect;
import test.pageobjects.Login;

public class LoginTests {

	private static WebDriver driver;

	@Test(description = "001 - Login into application - Positive")
	public void loginPositiveTest() {

		// Instantiate the pages
		Connect pConnect = new Connect();

		// Call the openChrome method
		driver = pConnect.openChrome();

		Login pLogin = new Login(driver);

		// Validate page loaded
		pLogin.validatePageLoaded();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();

	}
}
