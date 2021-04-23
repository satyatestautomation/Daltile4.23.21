package slamMobility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	 
	public LoginPage(WebDriver driver){ 
        this.driver=driver; 
        
}    //This method is set Username
	public void setUsername(String strUsername){
        WebElement Username = driver.findElement(By.id("j_username"));
        Username.sendKeys(strUsername);
    }
    // This method is to set Password in the password text box
    public void setPassword(String strPassword){
        WebElement passwordTextBox= driver.findElement(By.id("j_password"));
        passwordTextBox.sendKeys(strPassword);
    }
    // This method is to click on Location
    public void setLocation(String location){
         WebElement Location= driver.findElement(By.id("store"));
         Location.sendKeys(location);
              
    }    

    //This method is to click on Login button
    public  HomePage setLoginButton() {
    	WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
    	Login.click();
    
    
    	return new HomePage(driver);
    	





	}

}
