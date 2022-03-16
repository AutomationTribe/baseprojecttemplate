package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public void InitializeDriver() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SBSC\\\\Documents\\\\sbsc\\\\Automation\\\\Programs\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		String url =  LoadProp().getProperty("url");
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}
	
	public Properties LoadProp() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SBSC\\eclipse-workspace\\demoblaze\\src\\main\\java\\basePackage\\data.properties");
		
		 prop.load(fis);
		 
		 return prop;
	}
}
