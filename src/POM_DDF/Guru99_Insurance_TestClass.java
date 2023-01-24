package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Insurance_TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
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
		
			//Fetch Test Data
			FileInputStream file=new FileInputStream("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\Parameterization\\raj.xlsx");
					
				 Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet6");
					
					
				
				//Create object of POM-I
					Guru99_Insurance_Login Login=new Guru99_Insurance_Login(driver);		
				 String	EM=Sh.getRow(0).getCell(0).getStringCellValue(); //saradeg41@gmail.com
					Login.enterEmail(EM);
					
					//Wait
					Thread.sleep(1000);
				 String	PSW=Sh.getRow(1).getCell(0).getStringCellValue(); //Sai@1117
					Login.enterPassword(PSW);
					
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
