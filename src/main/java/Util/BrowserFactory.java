package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		
			//Set chrome as the default browser
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			//Open chromeDriver
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Go to the website
			driver.get("http://techfios.com/test/101/");
			return driver;
		}
		
		public static void tearDown() {
			driver.close();
			driver.quit();
		}

}
