package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	public WebDriver _driver;
	
	public SignUpPage(WebDriver driver) {
		
		this._driver =  driver;
	}
	
	By SignUpUsername = By.cssSelector("input[id='sign-username']");
	By SignUpPassword = By.cssSelector("input[type='sign-password']");
	
	public WebElement SignUpUsername() {
		return _driver.findElement(SignUpUsername);
	}
	
	public WebElement SignUpPassword() {
		return _driver.findElement(SignUpPassword);
	}
}
