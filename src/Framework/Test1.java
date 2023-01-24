package Framework;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	
	 //without DDF

	public static void main(String[] args) throws InterruptedException
	{
		
		
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
		
		
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
		WebDriver driver=new ChromeDriver();	
		
		//To open an application/To enter an URL
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		//Wait
		Thread.sleep(2000);
		
		//To Maximise window
		
		driver.manage().window().maximize();
		
		//Wait
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saradeg41@gmail.com");
		
		//Wait
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai@1117");
		
		//Wait
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		//Test Case-I: Verify Email Address
		
		String ExpectedEmail="saradeg41@gmail.com";
		
	     WebElement	S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
	
        String	ActualEmail=S1.getText();
        
        
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
