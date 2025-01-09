package demoAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	
	public WebDriver driver;
	
	public void windowHandleMethod()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h1[text()='CONTACT US']")).click();
		driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent+"parent");
		
		Set<String> childwindows=driver.getWindowHandles();
		//System.out.println(childwindows+"childwindows");
		
		String title="";
		
		for(String newChild:childwindows)
		{
			if(!newChild.equals(parent))
			{
				System.out.println("child windows"+newChild);
				driver.switchTo().window(newChild);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
				
			}
			
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement username=driver.findElement(By.id("text"));
				username.sendKeys("aaa");
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("aaaa");
				WebElement loginbtn=driver.findElement(By.id("login-button"));
				loginbtn.click();
			}
			
			if(title.equals("WebDriver | Contact Us"))
			{
				
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("neethu");
				WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
				lastname.sendKeys("geee");
			}
			
			
			
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WindowHandlingDemo obj1=new WindowHandlingDemo();
		obj1.windowHandleMethod();
	}

}
