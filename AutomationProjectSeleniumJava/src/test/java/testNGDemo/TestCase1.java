package testNGDemo;

import org.testng.annotations.Test;

//open application
//login
//logout

public class TestCase1 
{
	@Test
	
	public void openApp()
	{
		System.out.println("open application");
	}
	
	@Test
	public void loginIn()
	{
		System.out.println("login in to application");
	}
	
	@Test
	public void loginOut()
	{
		System.out.println("logout from application");
	}

}
