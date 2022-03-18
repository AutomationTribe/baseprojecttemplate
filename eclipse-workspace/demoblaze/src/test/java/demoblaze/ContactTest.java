package demoblaze;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.ContactPage;
import pageObjects.HomePage;

public class ContactTest extends Base{
	
	@BeforeTest
	public void NavigateToContactUs() throws IOException {
		
		InitDriver();
		
		HomePage home = new HomePage(_driver);
		home.ContactButton().click();
	}
	
	@Test(description="Test user can message with contact us")
	public void ContactUs() throws  InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(_driver,20);
		ContactPage contact = new ContactPage(_driver);
		contact.contactEmail().sendKeys("austinaataga@yopmail.com");
		contact.contactName().sendKeys("Austin Ataga");
		contact.message().sendKeys("Test demo blaze automation. Task by Theoremone LLC. Happy to be here");
		contact.contactButton().click();
		wait.until(ExpectedConditions.alertIsPresent());
		String actual = _driver.switchTo().alert().getText();
		String expected = "Thanks for the message!!";
		//assertions 
        assertEquals(actual, expected);
		
		_driver.switchTo().alert().accept();
		//explicit wait and assertions 
	}
	
	@AfterTest()
	public void TearDown() {
		_driver.close();
	}

}
