package testScript;

import org.testng.annotations.Test;

import pages.ClientPage;
import pages.LoginPage;

public class ClientTest extends Base{
	
	@Test
	public void verifyClientSearch()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserNameEnterPassword("carol", "1q2w3e4r");
		lp.clickLoginButton();
		
		ClientPage clientpage=new ClientPage(driver);
		clientpage.clickLink();
		clientpage.enterClientNameId();
		clientpage.clickClientSearchBtn();
	}

}
