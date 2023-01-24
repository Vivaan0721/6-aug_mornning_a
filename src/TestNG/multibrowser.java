package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser 
{
	@Parameters("browserName")
	
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		
		WebDriver driver=null;
		
		
		if(browserName.equals("Chrome"))
		{
			
			System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
	}
	
	else if(browserName.equals("firefox"))   
	{
		System.setProperty("webdriver.gecko.driver","D:\\Baliraj\\Baliraj SW TESTING\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		//"C:\\SOFTWARE TESTING
		
		driver=new FirefoxDriver();
		
		
	}
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		driver.manage().window().maximize();
		
		
		

		//Wait
		Thread.sleep(2000);
		
		//Enter Email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saradeg41@gmail.com");
		
		//Wait
		Thread.sleep(2000);	
		//Enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai@1117");
		
		//Wait
		Thread.sleep(2000);	
		//Click login button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		//Test Case-I: Verify Email Address
		
		String ExpectedEmail="saradeg41@gmail.com";
	
	WebElement	S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
	           
	    String   ActualEmail=S1.getText();  //saradeg41@gmail.com
	
	    
	   if(ExpectedEmail.equals(ActualEmail))
	   {
		   System.out.println("Pass");
	   }
	   else 
	   {
		   System.out.println("Fail");
	   } 
		

	
		
	}
	

}
