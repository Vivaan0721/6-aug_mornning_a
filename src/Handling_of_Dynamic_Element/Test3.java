package Handling_of_Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	
	 //handling of Dynamic Element

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
		
		//To Maximise window
					
		driver.manage().window().maximize();
		
		//Wait
		
		Thread.sleep(2000);
		
		//Close Hidden division pop-up

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		//Wait

		Thread.sleep(2000);
		
		//Enter "redmi note 10s"

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10s");
		
		//Wait
		Thread.sleep(2000);
		
		//click search button

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//Wait
		Thread.sleep(2000);
		
		//Identify Review element

		WebElement rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]"));
		
		//to get the text

		String S1=rating.getText();
		
		System.out.println(S1);
	}
}
