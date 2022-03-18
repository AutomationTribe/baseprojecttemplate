package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	public WebDriver _driver;
	
	public ContactPage(WebDriver driver) {
		this._driver =  driver;
	}
	
	By contactEmail =  By.cssSelector("input[id='recipient-email']");
	By contactName = By.cssSelector("input[id='recipient-name']");
	By message =  By.cssSelector("textarea[id='message-text']");
	By contactButton = By.xpath("/html/body/div[1]/div/div/div[3]/button[2]");
	
	
	public WebElement contactEmail() {
		
		return _driver.findElement(contactEmail);
	}
	
	public WebElement contactName() {
		
		return _driver.findElement(contactName);
	}
	public WebElement message() {
	
	return _driver.findElement(message);
	}
	public WebElement contactButton() {
	
	return _driver.findElement(contactButton);
	}
}
