package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method4
{
	public static void main (String[] args) throws InterruptedException
	   {
		   
		 //Parameter-I: Name of the Browser
			 //Parameter-II:Path of chromeDriver.exe file
				
		   System.setProperty("webdriver.chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		   
		   
		   
		 //Create object of Chromedriver class and provide reference of WebDriver(upcasting)
		   
		WebDriver driver=new ChromeDriver(); 
		

		//To open an application/To enter an URL
		driver.navigate().to("https://www.facebook.com/");	
		
		//To wait
		Thread.sleep(2000);
		
		//To open an application/To enter an URL
				driver.get("https://kite.zerodha.com/");
		
		//To wait
		Thread.sleep(2000);
		
		//To move backward
		driver.navigate().back();
		
		//To wait
		Thread.sleep(2000);
		
		//To move forward
		driver.navigate().forward();
		
		//To wait
		Thread.sleep(2000);
		
		//To refresh webpage
		driver.navigate().refresh();
		
		//To close all tab of browser/close Browser
		driver.quit();
		
		
	   }
}
