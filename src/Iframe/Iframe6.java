package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe6 {
	


	public static void main(String[] args) throws InterruptedException
	{
		
		
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
		
		WebDriver driver=new ChromeDriver();
		
		//To open an application/To enter an URL

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Wait
		Thread.sleep(4000);
		
		//To switch to Iframe(WebElement)

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		//Wait
		Thread.sleep(4000);	
		
		//Click "Click me to display Date and Time" Button

		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Wait
		
		Thread.sleep(4000);	
		
		//To switch to main page	

		driver.switchTo().defaultContent();
		
		//Wait
		
		Thread.sleep(4000);	
		
		//Click Home Button

		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		

		
		
	}

}
