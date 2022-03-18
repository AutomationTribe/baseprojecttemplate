package demoblaze;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.AboutUsPage;
import pageObjects.HomePage;

public class AboutUsTest extends Base {
	
	@BeforeTest
	public void NavigateToAboutUs() throws IOException {
		InitDriver();
		
		HomePage home = new HomePage(_driver);
		home.AboutUsButton().click();
	}
	
	@Test(description="Tests user can playvideo in about us")
	public void PlayVideo() throws IOException {
			
		AboutUsPage aboutUs = new AboutUsPage(_driver);
		aboutUs.PlayVideoButton().click();	
		assertTrue(aboutUs.videoPause().isDisplayed());
		//implicit wait and assertions 
	}
	
	@AfterTest()
	public void TearDown() {
		_driver.close();
	}

}
