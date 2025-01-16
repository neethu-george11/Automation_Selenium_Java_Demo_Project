package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase5
{
	public WebDriver driver;
	@BeforeMethod
	public void openUrl()
	{
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
	}
  
  @Test(priority = 3)
	public void testLogoPresence() {
		WebElement logo = driver.findElement(By.xpath("//img[@src='/payrollapp/images/logo.png']"));
		boolean status = logo.isDisplayed();
		System.out.println(status);

	}

	@Test(priority = 2)
	public void login() {
		WebElement usernametxtbox = driver.findElement(By.xpath("//input[@id='loginform-username']"));
		usernametxtbox.sendKeys("carol");
		WebElement passwordtxtbox = driver.findElement(By.xpath("//input[@id='loginform-password']"));
		passwordtxtbox.sendKeys("1q2w3e4r");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));

		System.out.println(checkbox.isEnabled());

		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login-button']"));
		loginbtn.click();

	}

  
  
}
