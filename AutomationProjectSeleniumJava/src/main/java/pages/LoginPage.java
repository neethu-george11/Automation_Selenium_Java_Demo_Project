package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;//declare WebDriver as globally
	//create constructor
	public LoginPage(WebDriver driver)//pass parameter WebDriver driver 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath = "//input[@id='loginform-username']")
	WebElement username;
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement password;
	@FindBy(xpath="//button[@name='login-button']")
	WebElement loginbtn;
	
	public void enterUserNameEnterPassword(String userNameField, String passwordField) 
	{
		username.sendKeys(userNameField);
		password.sendKeys(passwordField);
	}
	
	public void clickLoginButton() 
	{
		loginbtn.click();
	}

}
