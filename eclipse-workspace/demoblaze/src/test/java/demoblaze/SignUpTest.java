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
import pageObjects.SignUpPage;


public class SignUpTest extends Base {

	@BeforeTest
	public void NavigateToSignUp() throws IOException {
		
		InitDriver();	
		HomePage home = new HomePage(_driver);
		home.SignUpButton().click();	
	}
	
	
	@Test(description="Tests a user can sign up with data")
	public void ValidSignUp() throws IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(_driver,20);
		
		SignUpPage signUp = new SignUpPage(_driver);
		
		signUp.SignUpUsername().sendKeys("Francas");
		signUp.SignUpPassword().sendKeys("Pankas");
		signUp.SignUpButton().click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String actual =_driver.switchTo().alert().getText();
	    String expected = "Sign up successful.";
	    
	    //assertions
	    assertEquals(actual,expected);
	    _driver.switchTo().alert().accept();

	}
	
	@Test(description="Test that user can not sign up with existing data")
	public void InvalidSignUp() throws IOException {
		
		WebDriverWait wait = new WebDriverWait(_driver,20);
		
		SignUpPage signUp = new SignUpPage(_driver);
		
		signUp.SignUpUsername().sendKeys("Francas");
		signUp.SignUpPassword().sendKeys("Pankas");
		signUp.SignUpButton().click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		String actual =_driver.switchTo().alert().getText();
	    String expected = "This user already exist.";
	    
	    //assertions
	    assertEquals(actual,expected);
	    _driver.switchTo().alert().accept();	
	}
	
	@AfterTest()
	public void TearDown() {
		_driver.close();
	}


}
