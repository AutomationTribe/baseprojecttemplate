package demoblaze;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ShoppingCartPage;

public class CheckoutTest extends Base{
	
	
	@BeforeTest
	public  void Initiate() throws IOException {
		InitDriver();
		WebDriverWait wait = new WebDriverWait(_driver,10);
		HomePage home = new HomePage(_driver);
		home.SecondProduct().click();
		
		ProductDetailPage productDetail = new ProductDetailPage(_driver);
		productDetail.AddToCartButton().click();
		wait.until(ExpectedConditions.alertIsPresent());
		_driver.switchTo().alert().accept();
		home.CartButton().click();
		
		ShoppingCartPage cart = new ShoppingCartPage(_driver);
		cart.PlaceOrder().click();
	}
	
	@Test()
	public void CheckOut() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(_driver,10);
		CheckoutPage checkout = new CheckoutPage(_driver);
		checkout.Name().sendKeys("Adam");
		checkout.Country().sendKeys("Nigeria");
		checkout.City().sendKeys("Lagos");
		checkout.CreditCard().sendKeys("424241426161");
		checkout.Month().sendKeys("March");
		checkout.Year().sendKeys("2022");
		checkout.CheckoutButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]")));
		assertTrue(checkout.OrderSuccess().isDisplayed());
		checkout.OrderConfirm().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[10]/div[7]/div/button")));
	}
	
	
	@AfterTest()
	public void TearDown(){
		_driver.quit();
	}

}
