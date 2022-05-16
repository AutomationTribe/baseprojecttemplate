package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver _driver;
	
	public void Init(String browser,String url) throws IOException {
		
		if(browser.contains("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SBSC\\Documents\\sbsc\\Automation\\Programs\\chromedriver.exe");			
			_driver = new ChromeDriver();
			
		}else if(browser.contains("firefox")) {
			
			System.setProperty("webriver.gecko.driver", "C:\\Users\\SBSC\\Documents\\sbsc\\Automation\\Programs\\geckodriver.exe");
			_driver = new FirefoxDriver();
		}
		
		_driver.manage().window().maximize();
		
		_driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
		
		//Load urls dynmaically if url is different 
		
		if(url == "adminUrl" ) {
			
			LoadProp().getProperty("adminUrl");
		}else {
			LoadProp().getProperty("baseUrl");
		}
		
		_driver.get(url);
		
	}
	
	public Properties LoadProp() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SBSC\\eclipse-workspace\\projectbasetemplate\\data.properties");
		
		prop.load(fis);
		
		return prop;
	}

}
