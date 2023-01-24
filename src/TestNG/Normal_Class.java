package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Normal_Class {

	public static void main(String[] args) 
	{
		//Parameter-I: Name of the Browser
	 //Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("webdriver.gecko.driver","D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\geckodriver.exe");	
		
	      WebDriver driver=new FirefoxDriver();
	
		
	//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
	
		
		
		//To open an application/To enter an URL
		driver.get("https://www.facebook.com");
		
		
	
	}

}
