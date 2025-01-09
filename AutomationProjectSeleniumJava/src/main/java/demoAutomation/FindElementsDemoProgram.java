package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsDemoProgram extends LaunchBrowserParentClass {
	
	public void check4Checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		
		List<WebElement> checkbox=driver.findElements(By.className("check-box-list"));
		
		//Enhanced For Loop
		for(WebElement fnlcheck:checkbox) //take 1 by 1 each checkbox & store in to variable -variable type WebElement
		{
			fnlcheck.click();
		}
		
		//Normal For loop
	/*	for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();//extract each item-using get method
		}
		*/
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindElementsDemoProgram pgrm=new FindElementsDemoProgram();
		pgrm.chromeLaunch();
		pgrm.check4Checkbox();
		
		}

}
