package testNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
  
	@Test(priority=1)
	public void testMethod()
	{
		
		System.out.println("aaaa");	
	}
	@BeforeMethod
	public void openApplication()
	{
		
		System.out.println("bbbb");		
	}
	@AfterMethod
	public void closeApplication()
	{
		
		System.out.println("ccc");		
	}
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("dddd");		
	}
	
	public void afterClass()
	{
		
		System.out.println("eeeeee");		
	}
	
}
