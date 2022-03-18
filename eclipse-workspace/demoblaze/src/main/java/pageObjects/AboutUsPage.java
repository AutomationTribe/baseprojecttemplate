package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage {
	
	public WebDriver _driver;
	
	public AboutUsPage(WebDriver driver) {
		this._driver =  driver;
	}
	
	By videoPause = By.cssSelector("button[title='Pause']");
	
	By playVideoButton = By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div/button");
	
	
	public WebElement PlayVideoButton() {
		return _driver.findElement(playVideoButton);
	}

	public WebElement videoPause() {
		return _driver.findElement(videoPause);
	}
}
