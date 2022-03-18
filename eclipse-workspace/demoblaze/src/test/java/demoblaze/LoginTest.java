package demoblaze;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest extends Base{

	@BeforeTest
	public void NavigateToLogin() throws IOException {
		
		InitDriver();
		HomePage home = new HomePage(_driver);
		home.SignInButton().click();
	}
	
	@Test(description="Tests user can login with valid credentials")
	public void ValidLogin() throws IOException {
		WebDriverWait wait = new WebDriverWait(_driver,15);
		LoginPage loginPage = new LoginPage(_driver);
		
		loginPage.LoginUsername().sendKeys("username");
		loginPage.LoginPassword().sendKeys("password");
		loginPage.LoginButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
	    //assertion
		assertTrue(_driver.findElement(By.id("nameofuser")).isDisplayed());
		
	}
	
	@Test(description="Tests user cannot login with invalid credentials")
	public void InvalidLogin() throws IOException {
		
		WebDriverWait wait = new WebDriverWait(_driver,15);
		LoginPage loginPage = new LoginPage(_driver);
		
		loginPage.LoginUsername().sendKeys("239dslkds");
		loginPage.LoginPassword().sendKeys("asd90ass");
		loginPage.LoginButton().click();
		//assertions
		wait.until(ExpectedConditions.alertIsPresent());
		
		String actual = _driver.switchTo().alert().getText();
		String expected = "User does not exist.";
		
		assertEquals(actual,expected);
		
	}
	
	@AfterTest()
	public void TearDown() {
		_driver.close();
	}
	

	
}
