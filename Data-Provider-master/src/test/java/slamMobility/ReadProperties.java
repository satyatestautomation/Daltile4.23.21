package slamMobility;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ReadProperties {

		public static void main(String[] args) throws IOException {
			WebDriver driver;
		
			Properties prop = new Properties();
			
			FileInputStream ip= new FileInputStream("C:/Users/C115430/eclipse-workspace/myProjectOasis/config.Properties");
			
			prop.load(ip);
			
			System.out.println(prop.getProperty("browser"));
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C://Selenium files//Google Chrome//chromedriver.exe");
				driver = new ChromeDriver();
				
//				else if(browserName.equals("FF")) {
//				driver = new FireFoxDriver();
//			}
//				
//				else if(browserName.equals("IE")) {
//					driver = new InternetExplorerdriver();
//				}
	//
				
				driver.get(prop.getProperty("URL"));
				
				driver.findElement(By.id("j_username")).sendKeys(prop.getProperty("Login"));
				driver.findElement(By.id("j_password")).sendKeys(prop.getProperty("Password"));
				driver.findElement(By.id("store")).sendKeys(prop.getProperty("Location"));
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();

				}
							
			}

		}