package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	
	//How to open a Browser/launch browser in a Selenium
	public static void main(String[] args)
	{
		
		
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver","D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		
	     //Create object of Chromedriver class and provide reference of Chromedriver 

		ChromeDriver driver=new ChromeDriver();         //Classname objectname=new Classname();
		
		
		driver.get("https://www.facebook.com/login/");
	}

}
