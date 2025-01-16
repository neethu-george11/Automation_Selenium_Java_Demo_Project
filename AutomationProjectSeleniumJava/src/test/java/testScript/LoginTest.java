package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
	
	/*@Test
	public void verifyLogin() 
	{
	WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
	username.sendKeys("carol");
	WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
	password.sendKeys("1q2w3e4r");
	WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login-button']"));
	loginbutton.click();
	
	}*/
	
	@Test
	public void verifyLogin() 
	{
	LoginPage lp=new LoginPage(driver);//create object 
	lp.enterUserNameEnterPassword("carol", "1q2w3e4r");//value pass -username and passwrd
	}
	

}
