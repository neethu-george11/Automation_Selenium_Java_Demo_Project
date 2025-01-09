package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends LaunchBrowserParentClass {
	
	public void dragDropMethod()
	{
		
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	
	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	
	Actions actions=new Actions(driver);
	
	actions.moveToElement(drag1).click();
	
	actions.doubleClick(drag1).perform();
	
	WebElement drop1=driver.findElement(By.id("mydropzone"));
	actions.dragAndDrop(drag1, drop1).build().perform();
	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DragDrop obj=new DragDrop();
		obj.chromeLaunch();
		obj.dragDropMethod();
		
	}

}
