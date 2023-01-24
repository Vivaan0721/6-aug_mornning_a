package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup 
    {
	
	   //Hidden Division pop-up

	public static void main(String[] args) throws InterruptedException
	{
		
		
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
		
		WebDriver driver=new ChromeDriver();
		
		//To open an application/To enter an URL

		driver.get("https://www.flipkart.com/");
		
		//Wait

		Thread.sleep(2000);

		//Enter Mobile No/Email

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9096819863");;
		
		       //Wait
				Thread.sleep(2000);
				
				//Click Request OTP Button

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
		
	}
		

}
