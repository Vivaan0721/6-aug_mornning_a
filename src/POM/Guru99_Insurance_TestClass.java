package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Insurance_TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
			
		System.setProperty("webdriver.chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");	
			
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
			WebDriver driver=new ChromeDriver();
			
			
			//To open an application/To enter an URL
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			//Wait
			Thread.sleep(2000);
		
		
		//Create object of POM-I
			Guru99_Insurance_Login Login=new Guru99_Insurance_Login(driver);	
			Login.enterEmail();
			//Wait
			Thread.sleep(1000);
			
			Login.enterPassword();
			
			//Wait
			Thread.sleep(1000);
			Login.clickLoginBtn();
			
			
		
			//Create object of POM-II
	Guru99_Insurance_BrokerInsuranceWebPage login1=new Guru99_Insurance_BrokerInsuranceWebPage(driver);
			     //Wait
			  Thread.sleep(1000);      
			login1.verifyEmail();
			
		    //Wait
			Thread.sleep(1000);
	        login1.clickLogoutBtn();
	        
	        //Wait
	     	Thread.sleep(1000);
	        
	        
	       //To close Browser
	        driver.close();
	        
	        
	}
	
	
	
}
