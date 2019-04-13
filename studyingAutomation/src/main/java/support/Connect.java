package support;

import org.openqa.selenium.chrome.ChromeDriver;

public class Connect {

	public void openChrome () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\graziela.cerentini\\eclipse-workspace\\studyingAutomation\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	
}
