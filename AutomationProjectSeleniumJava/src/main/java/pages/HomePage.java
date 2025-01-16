package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public WebDriver driver;//declare WebDriver as globally
	//create constructor
	public HomePage(WebDriver driver)//pass parameter WebDriver driver 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement clickCarol;
	@FindBy(xpath="//a[@class='logout-btn']")
	WebElement logoutClick;
	
	public void caroltextClick() 
	{
		clickCarol.click();
	}
	public void logouttextClick() 
	{
		logoutClick.click();
	}
}
