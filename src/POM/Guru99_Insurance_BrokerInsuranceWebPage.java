package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Insurance_BrokerInsuranceWebPage {
	

	//POM-II
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")	private	WebElement SingnedInAs; //private WebElement SingnedInAs=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
	@FindBy(xpath="//input[@class='btn btn-danger']")    private WebElement  LogoutBtn; //private WebElement LogoutBtn=driver.findElement(By.xpath("//input[@class='btn btn-danger']"));
	
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public	Guru99_Insurance_BrokerInsuranceWebPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3. Utilize within a method with access level public
	
		public void verifyEmail() 
		{
			String ExpectedEmail="saradeg41@gmail.com";
			
		    String	ActualEmail=SingnedInAs.getText();    //saradeg41@gmail.com
		    
		    if(ExpectedEmail.equals(ActualEmail)) //true  fail
		    {
		    	System.out.println("Pass");
		    }
		    else 
		    {
		    	System.out.println("Fail");
		    }
		    
		    
		}
		
		public void clickLogoutBtn() 
		{
			LogoutBtn.click();
		}
}