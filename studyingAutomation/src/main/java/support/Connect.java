package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connect {

	public WebDriver openChrome () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\graziela.cerentini\\git\\studyingAutomation\\studyingAutomation\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		return driver;
	}
	
}
