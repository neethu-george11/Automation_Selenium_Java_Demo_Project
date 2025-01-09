package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo extends LaunchBrowserParentClass{

	
	public void dragDropMouseActionMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		//create actions class object
		Actions obj=new Actions(driver);
		
		//capture source element
		WebElement sourceElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		//capture target element
		WebElement targetElement=driver.findElement(By.id("mydropzone"));
		
		//to perform drag-take object 
		obj.dragAndDrop(sourceElement, targetElement).perform();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MouseActionsDemo obj1=new  MouseActionsDemo();
		 obj1.chromeLaunch();
		 obj1.dragDropMouseActionMethod();

	}

}
