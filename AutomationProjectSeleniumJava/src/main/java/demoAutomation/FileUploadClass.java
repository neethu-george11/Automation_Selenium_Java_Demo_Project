package demoAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadClass {
	
	public WebDriver driver;
	
	public void fileUploadMethod()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement click_btn=driver.findElement(By.xpath("//a[@title='Add more files']"));
		click_btn.click();
		click_btn.sendKeys("C:\\Users\\iamne\\Downloads\\PDF Notes\\Jenkins.pdf");
		
	}
	public void robotClassMethod() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement click_btn=driver.findElement(By.xpath("//a[@title='Add more files']"));	
		click_btn.click();
		
		StringSelection s=new StringSelection("C:\\Users\\iamne\\Downloads\\PDF Notes\\Jenkins.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot robot=new Robot();
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		FileUploadClass obj=new FileUploadClass();
		//obj.fileUploadMethod();
		obj.robotClassMethod();
	}

}
