package org.salesforce.Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	public static WebDriver driver;
	public  Properties prop = new Properties();
	public  FileReader fr;
	boolean eleStatus = false;
	
	@BeforeTest
	public void setUp() throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\meniv\\eclipse-automationWorkspace\\PageObjectModelSF\\src\\test\\resources\\config.properties");
			prop.load(fr);
			
			if (driver == null) {
				FileReader fr1 = new FileReader("C:\\Users\\meniv\\eclipse-automationWorkspace\\PageObjectModelSF\\src\\test\\resources\\config.properties");
				prop.load(fr1);
			}
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Successfully launched browser");
//				driver.get(prop.getProperty("url"));
//				System.out.println("Successfully launched applicatio");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				System.out.println("Successfully launched browser");
//				driver.get(prop.getProperty("url"));
//				System.out.println("Successfully launched browser");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				System.out.println("Successfully launched browser");
//				driver.get(prop.getProperty("url"));
//				System.out.println("Successfully launched browser");
			}
		}
		
	@BeforeMethod
	public void launchSFApplication() {
		driver.get(prop.getProperty("url"));
		System.out.println("Successfully launched browser");
	}
	
	public String getUserName () {
		String username = prop.getProperty("userName");
		return username;
	}
	
	public String getPassword () {
		String password = prop.getProperty("password");
		return password;
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		
	}
	
	
}
