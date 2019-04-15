package test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	private WebDriver driver ;
	
	// Selectors
	By headerFacebook = By.xpath("//u[contains(text(), 'Facebook')]");
	
	public Login(WebDriver driver) {
		this.driver = driver;	
	}

	public void validatePageLoaded() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(headerFacebook));
	}

}
