package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword7 {
	
	@Test(enabled=false)                                
	public void TC1()             //Test Case/Method
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2()             //Test Case/Method    
	{
		Reporter.log("Running TC2",true);
	}
	
	

}
