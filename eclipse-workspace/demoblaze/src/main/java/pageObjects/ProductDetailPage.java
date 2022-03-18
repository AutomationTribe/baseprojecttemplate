package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {
	
	public WebDriver _driver;
	
	public ProductDetailPage(WebDriver driver) {
		
		this._driver = driver;
	}

	By addToCartButton =  By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
	
	
	public WebElement AddToCartButton() {
		
		return _driver.findElement(addToCartButton);
	}
}
