package testScript;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends Base{
	
	@Test
	public void verifyUserAbleToLogout()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserNameEnterPassword("carol", "1q2w3e4r");
		lp.clickLoginButton();
		
		HomePage hmepage=new HomePage(driver);
		hmepage.caroltextClick();
		hmepage.logouttextClick();
	}

}
