package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4

{
	public WebDriver driver;

	@Test(priority = 1)
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

	public void close()

	{

	}
}
