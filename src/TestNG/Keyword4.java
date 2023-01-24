package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4 {
	
	@Test(priority=2)                                
	public void TC1()             //Test Case/Method
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(priority=1)
	public void TC2()             //Test Case/Method    
	{
		Reporter.log("Running TC2",true);
	}
	
	
	@Test                                          //by default priority=0  
	public void TC3()             //Test Case/Method
	{
		Reporter.log("Running TC3",true);
	}
	
	@Test                                          //by default priority=0  
	public void TC4()             //Test Case/Method
	{
		Reporter.log("Running TC4",true);
	}
	

}
