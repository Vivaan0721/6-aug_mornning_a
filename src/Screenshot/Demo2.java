package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo2 {

	
	//How to capture screenshot of webpage
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
			
		   System.setProperty("webdriver.chrome.driver","D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");	
			
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
			WebDriver driver=new ChromeDriver();
			
			
			//To open an application/To enter an URL
			driver.get("https://kite.zerodha.com");
		
		   //wait
		   Thread.sleep(2000);
		   
		   
		   
		   
		 //Typecast/Downcasting/Convert   
		File  Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		System.out.println(Source);
		   
		   
		File Destination=new File("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\TakesScreenshot\\a.jpg");
		   
		FileHandler.copy(Source,Destination);  //Source Path    Destination Path
		   
		
		   
	}
	

}
