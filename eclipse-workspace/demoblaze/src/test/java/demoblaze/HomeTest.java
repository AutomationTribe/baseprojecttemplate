package demoblaze;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.Base;
import pageObjects.HomePage;

public class HomeTest extends Base {
	
	@BeforeTest()
	public void NavigateToHome() throws IOException {
		InitDriver();
	}

	@Test
	public void NavigateToLaptopCat() {
		HomePage home = new HomePage(_driver);
		home.LaptopCat().click();
	}
	
	@Test
	public void NavigateToMonitorCat() {
		HomePage home = new HomePage(_driver);
		home.MonitorCat().click();
	}
	
	@AfterTest
	public void TearDown() {
		_driver.close();
	}
}
