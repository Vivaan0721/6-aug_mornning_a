package WebTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample1 {
	
		//handling of Web Table
			public static void main(String[] args) throws InterruptedException
			{
				
				
				//Parameter-I: Name of the Browser
				 //Parameter-II:Path of chromeDriver.exe file
				
				System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
				
				
				//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
				WebDriver driver=new ChromeDriver();	
				
				//To open an application/To enter an URL
				driver.get("file:///D:/Baliraj/Baliraj%20SW%20TESTING/Notes/automation/Web%20Table/Table1.html");
				
				//Wait
				Thread.sleep(2000);
				
				//To Maximise window
				
				driver.manage().window().maximize();
			
			//Find row size of the table
			
			List<WebElement> rows=driver.findElements(By.xpath("//table[@id='1234']//tr"));
						
			int S1=rows.size();
			
			System.out.println(S1);
			
			
		}

}
