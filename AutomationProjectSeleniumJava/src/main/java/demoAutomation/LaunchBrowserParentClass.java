package demoAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserParentClass {
	
	
	public WebDriver driver;
	
	public void chromeLaunch()
	{
		 driver=new ChromeDriver();
		 driver.get("https://selenium.qabible.in/index.php");
		 driver.manage().window().maximize();//maximize the browser window
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
