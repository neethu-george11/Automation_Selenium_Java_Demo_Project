package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorLocatorDemo extends LaunchBrowserParentClass{
	
	//Customized locator-we can write our own locator
	public void cssSelectorLocatorUseMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//tag id combination
		WebElement tag_id=driver.findElement(By.cssSelector("input#single-input-field"));
		
		//tag class combination
		driver.findElement(By.cssSelector("input.form-control"));
		
		//tag attribute combination
		driver.findElement(By.cssSelector("button[id='button-one']"));
		
		//tag class attribute combination
		driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
