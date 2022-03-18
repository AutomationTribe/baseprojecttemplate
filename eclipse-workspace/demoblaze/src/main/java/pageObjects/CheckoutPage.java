package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	public WebDriver _driver;
	public CheckoutPage(WebDriver driver) {
		this._driver = driver;
	}
	
	By name = By.cssSelector("input[id='name']");
	By country = By.cssSelector("input[id='country']");
	By city = By.cssSelector("input[id='city']");
	By creditCard = By.cssSelector("input[id='card']");
	By month = By.cssSelector("input[id='month']");
	By year = By.cssSelector("input[id='year']");
	By checkoutButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
	By orderSuccess = By.xpath("/html/body/div[10]");
	By orderConfirm = By.xpath("/html/body/div[10]/div[7]/div/button");
	
	public WebElement Name() {
		return _driver.findElement(name);
	}
	public WebElement Country() {
		return _driver.findElement(country);
	}
	public WebElement City() {
		return _driver.findElement(city);
	}
	public WebElement CreditCard() {
		return _driver.findElement(creditCard);
	}
	public WebElement Month() {
		return _driver.findElement(month);
	}
	
	public WebElement Year() {
		return _driver.findElement(year);
	}
	
	public WebElement CheckoutButton() {
		return _driver.findElement(checkoutButton);
	}
	
	public WebElement OrderSuccess() {
		return _driver.findElement(orderSuccess);
	}
	
	public WebElement OrderConfirm() {
		return _driver.findElement(orderConfirm);
	}
}