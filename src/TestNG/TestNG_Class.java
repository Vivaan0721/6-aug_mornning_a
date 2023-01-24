package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Class {
	@Test
	public void OpenBrowser()             //Test Method/ Test Case
	{
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
			
		System.setProperty("webdriver.chrome.driver","D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");	
			
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
			WebDriver driver=new ChromeDriver();
			
			
			//To open an application/To enter an URL
			driver.get("https://kite.zerodha.com/");	
			
			
				
	}

}
