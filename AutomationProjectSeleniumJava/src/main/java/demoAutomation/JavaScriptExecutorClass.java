package demoAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorClass {
	
	
	
	public void launchBrowserAmazon()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		JavascriptExecutor javascriptexe=(JavascriptExecutor) driver;
		javascriptexe.executeScript("window.scrollBy(0,2000)");
		javascriptexe.executeScript("window.scrollBy(0,-1000)");
		WebElement scrollbar=driver.findElement(By.xpath(""));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaScriptExecutorClass obj=new JavaScriptExecutorClass();
		obj.launchBrowserAmazon();

	}

}
