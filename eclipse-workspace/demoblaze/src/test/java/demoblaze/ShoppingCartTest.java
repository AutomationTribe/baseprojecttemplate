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

	
	
	@Test(description="Test that user can delete a product from the cart",dependsOnGroups={"ProductDetailTest.AddToCart"})
	public void DeleteProduct() throws IOException, InterruptedException {
		
		InitDriver();
		WebDriverWait wait = new WebDriverWait(_driver,60);
		HomePage home = new HomePage(_driver);
		home.CartButton().click();
	    Thread.sleep(10000);
		ShoppingCartPage cart = new ShoppingCartPage(_driver);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Delete']"),_driver.findElement(By.xpath("//*[text()='Delete']")).getText()));
		
		cart.DeleteProduct().click();
		//assertion
	}
	
	@AfterTest
	public void TearDown() {	
	  _driver.close();
	}
}
