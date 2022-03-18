package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver _driver;

	public void InitDriver() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SBSC\\\\Documents\\\\sbsc\\\\Automation\\\\Programs\\\\chromedriver.exe");
		
		 _driver = new ChromeDriver();
		
		_driver.manage().window().maximize();
		
		String url =  LoadProp().getProperty("url");
		
		_driver.get(url);
		
		_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public Properties LoadProp() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SBSC\\eclipse-workspace\\demoblaze\\src\\main\\java\\basePackage\\data.properties");
		
		 prop.load(fis);
		 
		 return prop;
	}
}
