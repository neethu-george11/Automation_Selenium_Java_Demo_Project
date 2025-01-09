package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsAssignment extends LaunchBrowserParentClass {
	
	public void findElementsMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		
		List<WebElement> textbx=driver.findElements(By.className("form-control"));
		
		
		for(WebElement fn:textbx)
		{
			fn.sendKeys("Hello...........");
		}
	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindElementsAssignment fin=new FindElementsAssignment();
fin.chromeLaunch();
fin.findElementsMethod();

	}

}
