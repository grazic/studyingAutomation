package test.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import support.Connect;

public class LoginTests {
	
	@Test(description = "001 - Login into application - Positive")
	public void loginPositiveTest() {
		
		//Instantiate the pages
		Connect pConnect = new Connect();
		
		//Call the openChrome method
		pConnect.openChrome();
		
	}
}
