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
	By SignUpPassword = By.cssSelector("input[id='sign-password']");
	By SignUpButton =  By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	
	public WebElement SignUpUsername() {
		return _driver.findElement(SignUpUsername);
	}
	
	public WebElement SignUpPassword() {
		return _driver.findElement(SignUpPassword);
	}
	
	public WebElement SignUpButton() {
		return _driver.findElement(SignUpButton);
	}
}
