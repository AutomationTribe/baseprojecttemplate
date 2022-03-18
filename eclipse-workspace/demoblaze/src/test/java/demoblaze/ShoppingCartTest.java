package demoblaze;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;
import pageObjects.ShoppingCartPage;

public class ShoppingCartTest extends Base {

	
	@BeforeTest()
	public void AddProductToCart() throws IOException, InterruptedException {
		
		InitDriver();
		
		ProductDetailPage productDetail = new ProductDetailPage(_driver);
		productDetail.AddToCartButton().click();
		_driver.switchTo().alert().accept();
		
	}
	
	@Test(description="Test that user can delete a product from the cart")
	public void DeleteProduct() throws IOException {
		
		InitDriver();
		WebDriverWait wait = new WebDriverWait(_driver,60);
		HomePage home = new HomePage(_driver);
		home.CartButton().click();
	
		ShoppingCartPage cart = new ShoppingCartPage(_driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a")));
		cart.DeleteProduct().click();
		//assertion
	}
	
	@AfterTest
	public void TearDown() {	
	  _driver.close();
	}
}
