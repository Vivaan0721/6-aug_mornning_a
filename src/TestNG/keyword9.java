package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword9 {
	
	@Test(timeOut=5000)                                
	public void TC1() throws InterruptedException             //Test Case/Method
	{
		Thread.sleep(3000);
		Reporter.log("Running TC1",true);
	}  
	
	@Test
	public void TC2()             //Test Case/Method    
	{
		Reporter.log("Running TC2",true);
	}
	
	

}
