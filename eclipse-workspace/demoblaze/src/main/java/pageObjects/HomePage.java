package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver _driver;
	
	public HomePage(WebDriver driver) {
		this._driver = driver;
	}

	By signUpButton = By.cssSelector("a[id='signin2']");
	By signInButton = By.cssSelector("a[id='login2']");
	By contactButton = By.xpath("/html/body/nav/div[1]/ul/li[2]/a");
	By aboutUsButton = By.xpath("/html/body/nav/div[1]/ul/li[3]/a");
	By cartButton = By.cssSelector("a[id='cartur']");
	//contact us;
	By welcomeUser = By.cssSelector("a[id='nameofuser']");
	
	By secondProduct = By.cssSelector("a[href='prod.html?idp_=2']");
	
	By laptopsCat =  By.linkText("Laptops");
	By MonitorsCat =  By.linkText("Monitors");
	
	public WebElement SignUpButton() {
		
		return _driver.findElement(signUpButton);
	}
	
	public WebElement SignInButton() {
		return _driver.findElement(signInButton);
	}
	
	public WebElement ContactButton() {
		return _driver.findElement(contactButton);
	}
	
	public WebElement AboutUsButton() {
		return _driver.findElement(aboutUsButton);
	}
	
	public WebElement CartButton() {
		return _driver.findElement(cartButton);
	}
	
	public WebElement WelcomeUser() {
		return _driver.findElement(welcomeUser);
	}
	
	
	public WebElement SecondProduct() {
		return _driver.findElement(secondProduct);
	}

	public WebElement LaptopCat() {
	return _driver.findElement(laptopsCat);	
	}
	
	public WebElement MonitorCat() {
		return _driver.findElement(laptopsCat);	
		}
}
