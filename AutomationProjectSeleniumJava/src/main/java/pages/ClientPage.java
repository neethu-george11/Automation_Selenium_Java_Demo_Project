package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	
	public WebDriver driver;//declare WebDriver as globally
	//create constructor
	public ClientPage(WebDriver driver)//pass parameter WebDriver driver 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	WebElement clientLinkLocator;
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientNameLocator;
	
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientIdLocator;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clientSubmitButtonLocator;
	
	public void clickLink()
	{
		clientLinkLocator.click();
	}
	
	public void enterClientNameId()
	{
		clientNameLocator.sendKeys("Bimal mathew");
		clientIdLocator.sendKeys("8");
	}
	
	public void clickClientSearchBtn()
	{
		clientSubmitButtonLocator.click();
	}

}
