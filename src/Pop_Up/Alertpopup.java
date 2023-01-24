package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup
{
	

	//How to Handle Alert Pop-up

	public static void main(String[] args) throws InterruptedException
	{
		
		
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
		
		WebDriver driver=new ChromeDriver();
		
		//To open an application/To enter an URL

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//Wait

		Thread.sleep(2000);
		
		//Enter CustomerID

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc123");
		
		//Wait

		Thread.sleep(2000);
		
		//Click Submit button

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//To switch To alert

		Alert alt=driver.switchTo().alert();
		
		//Wait

		Thread.sleep(2000);
		
		 //Click Ok button

		String Text=alt.getText();
		
		System.out.println(Text);
		
		
		
		

		
	}

}
