package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver _driver;
	
	public LoginPage(WebDriver driver) {
		
		this._driver = driver;
	}
	
    By loginUsername = By.cssSelector("input[id='loginusername']");
    By loginPassword = By.cssSelector("input[id='loginpassword']");
    By loginButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
	
    public WebElement LoginUsername() {
    	return _driver.findElement(loginUsername);
    }
    
    public WebElement LoginPassword() {
    	return _driver.findElement(loginPassword);
    }
    
    public WebElement LoginButton() {
    	return _driver.findElement(loginButton);
    }

}
