package demoblaze;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;

public class ProductDetailTest extends Base {
	
	@BeforeTest
	public void NavigateToProductDetail() throws IOException {
		InitDriver();
		WebDriverWait wait = new WebDriverWait(_driver,15);
	
		HomePage home = new HomePage(_driver);
		wait.until(ExpectedConditions.visibilityOf(home.SecondProduct()));
		home.SecondProduct().click();
	}

	@Test(groups={"ProductDetailTest.AddToCart"})
	public void AddToCart() {
		
		WebDriverWait wait = new WebDriverWait(_driver,15);
		ProductDetailPage productDetail = new ProductDetailPage(_driver);
		productDetail.AddToCartButton().click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String actual = _driver.switchTo().alert().getText();
		String expected = "Product added";
		assertEquals(actual,expected);
		
	}
	
	@AfterTest
	public void TearDown(){
		_driver.close();
	}
}
