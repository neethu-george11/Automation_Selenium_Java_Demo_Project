package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicLocators extends LaunchBrowserParentClass {
	
	public void navigateToMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	}
	
	public void locatorMethod()
	{
		//find element method -to find a single element 
		//need -By- abstract class help..
		//WebElement-interface
		
		//id tag
		WebElement textBox=driver.findElement(By.id("single-input-field"));
		
		//name tag
		WebElement name=driver.findElement(By.name("keywords"));
		
		//LinkText <a> tag
		WebElement link=driver.findElement(By.linkText("Radio Buttons Demo"));
		
		//PartialLinkText
		WebElement partialLink=driver.findElement(By.linkText("Radio"));
		
		
		//findElements
		List<WebElement> inputbox=driver.findElements(By.className("form-control"));
		System.out.println(inputbox.size()); 
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicLocators locator=new BasicLocators();
		locator.chromeLaunch();
		locator.navigateToMethod();
		locator.locatorMethod();

	}

}
