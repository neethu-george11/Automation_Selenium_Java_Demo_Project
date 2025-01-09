package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandlingDemo extends LaunchBrowserParentClass{
	
	public void staticTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			
	}
	
	//get full table data
	public void staticTableFullTable()
	{
		//take xpath of table
		WebElement tableFull=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableFull.getText());
	}
	
	public void selectRow()
	{
	WebElement row=	driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]"));//table xpath/tbody/tr-->single slash
	System.out.print(row.getText());
	}
	
	//select 3rd row 1st data
	public void selectSpecificData()
	{
		WebElement specificData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
		System.out.println(specificData.getText());
	}
	
	public void fullColumnData()
	{
		List<WebElement> columnData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement finalData:columnData)
		{
			System.out.println(finalData.getText());
		}
	}
	
	//check entered value is present in the table
	public void checkElementInTable()
	{
		String input="Rhona Davidson";
		List<WebElement> find=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement findEle:find)
		{
			if(findEle.getText().equals(input))
			{
				System.out.println(findEle.getText());
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandlingDemo ob=new TableHandlingDemo();
		ob.chromeLaunch();
		ob.staticTable();
		ob.staticTableFullTable();
		
		System.out.println("*************");
		
		ob.selectRow();
		
		System.out.println("*************");
		
		ob.selectSpecificData();
		
		System.out.println("*************");
		ob.fullColumnData();
		
		System.out.println("*************");
		ob.checkElementInTable();

	}

}
