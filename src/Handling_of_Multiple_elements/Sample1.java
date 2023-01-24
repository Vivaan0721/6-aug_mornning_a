package Handling_of_Multiple_elements;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sample1 {
	public static void main(String[] args) throws InterruptedException
	{
		
		
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
		
		WebDriver driver=new ChromeDriver();
		
		//To open an application/To enter an URL

		driver.get("https://www.facebook.com/");
		
		//Wait

		Thread.sleep(2000);
		
		//maximize browser

		driver.manage().window().maximize();
		
		//Wait
		Thread.sleep(2000);
		
		//to identify link

		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		
		for(WebElement S1:links)
			
		{
			System.out.println(S1.getText());
			
		}
		
	
		
		
	}

}
