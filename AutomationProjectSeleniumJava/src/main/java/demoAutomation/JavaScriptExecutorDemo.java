package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
public WebDriver driver;

	public void openApp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement usernametxtbox = driver.findElement(By.xpath("//input[@id='loginform-username']"));
		
		//JavascriptExecutor js=driver;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','john')",usernametxtbox);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutorDemo obj=new JavaScriptExecutorDemo();
		obj.openApp();
	}

}
