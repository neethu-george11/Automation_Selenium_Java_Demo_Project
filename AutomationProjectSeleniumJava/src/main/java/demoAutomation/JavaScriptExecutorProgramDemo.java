package demoAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorProgramDemo {
	
	public WebDriver driver;
	
	public void openUrlMethod()
	{
		//Launch amazon site
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//click,send,scroll up,scroll down
		//JavascriptExecutor js=driver;
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,3000)","");
		//upward scroll
		js.executeScript("window.scrollBy(0,-2000)","");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		js.executeScript("arguments[0].setAttribute('value','iphone')", searchbox);
		
		WebElement searchboxclick=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		js.executeScript("arguments[0].click()",  searchboxclick);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutorProgramDemo jso=new JavaScriptExecutorProgramDemo();
		jso.openUrlMethod();
	}

}
