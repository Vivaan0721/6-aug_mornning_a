package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	
	//Single selectable listbox


			public static void main(String[] args) throws InterruptedException
			{
				
				
				//Parameter-I: Name of the Browser
				 //Parameter-II:Path of chromeDriver.exe file
				
				System.setProperty("Webdriver.Chrome.driver", "D:\\Baliraj\\Baliraj SW TESTING\\chromedriver_win32\\chromedriver.exe");
				
				//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
				
				WebDriver driver=new ChromeDriver();
				
				//To open an application/To enter an URL

				driver.get("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\listbox\\MultiselectableListbox.html");
				
				
				//Wait
				Thread.sleep(2000);
				
				//Step-I: Identify Listbox and store it into an Object
				
				WebElement Country=driver.findElement(By.xpath("//select[@id='1234']"));
				
				//Step-II:Create object of Select Class
				
			
				Select S1=new Select(Country);

				
								
				//Step-III:Call the method
			      S1.selectByIndex(3);
				
			      Thread.sleep(2000);
			      
			      S1.selectByIndex(1);
			      
			      Thread.sleep(2000);
				
			      S1.selectByIndex(0);
			      
			      
			    //Wait
				  Thread.sleep(2000); 
				      
				      //To deselect option 
				     S1.deselectAll();
			      
			            
			}
	
	
}
