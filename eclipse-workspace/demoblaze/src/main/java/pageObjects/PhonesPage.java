package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesPage {
	
	public WebDriver _driver;
	
	public PhonesPage(WebDriver driver) {
		
		this._driver = driver;
	}
	
	By ItemTitle = By.cssSelector("a[href='prod.html?idp_=1']");

	
	public WebElement ItemTitle() {
		return _driver.findElement(ItemTitle);
	}
	
	
}
