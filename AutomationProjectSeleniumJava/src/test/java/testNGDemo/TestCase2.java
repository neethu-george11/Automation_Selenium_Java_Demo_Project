package testNGDemo;

import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(priority=1)
	public void openApp()
	{
	System.out.println("aaaa");	
	}
	
	@Test(priority=2)
	public void loginToApp()
	{
		System.out.println("bbbb");		
	}
	
	@Test
	public void LogoutFromApp()
	{
		System.out.println("ccc");	
	}

}
