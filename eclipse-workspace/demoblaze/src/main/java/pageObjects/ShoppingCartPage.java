package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
	
	public WebDriver _driver;
	
	public ShoppingCartPage(WebDriver driver) {
		this._driver =  driver;
	}
	
	By deleteProduct = By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a");
	By placeOrder = By.xpath("/html/body/div[6]/div/div[2]/button");
	
	public WebElement DeleteProduct() {
		return _driver.findElement(deleteProduct);
	}
	
	public WebElement PlaceOrder() {
		return _driver.findElement(placeOrder);
	}
 
}
