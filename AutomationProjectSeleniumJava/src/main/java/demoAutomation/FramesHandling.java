package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	
	public WebDriver driver;
	
	public void frameHandlingMethod()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement frame_banner=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame_banner);
		
		WebElement banner=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		banner.click();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FramesHandling obj=new FramesHandling();
		obj.frameHandlingMethod();
	}

}
