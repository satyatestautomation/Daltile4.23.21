package slamMobility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

		public static WebDriver driver;
		
		public WebDriver Initialize()
		{
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium files/Google Chrome/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ceramichybrisqa.mohawkind.com/slabmobilitystorefront/slabmobile/en/USD/login");
		return driver;
		}
		
		//public static void main(String[]args) {
			
		
	}
	


