package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword5 {
	
	@Test(priority=2)                                   //5
	public void TC1()             //Test Case/Method
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(priority=1)
	public void TC2()             //Test Case/Method       //3
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(priority=1)                                     //4
	public void TC5()             //Test Case/Method    
	{
		Reporter.log("Running TC5",true);
	}
	
	@Test                                          //by default priority=0     //1
	public void TC3()             //Test Case/Method
	{
		Reporter.log("Running TC3",true);
	}
	
	@Test                                          //by default priority=0     //2
	public void TC4()             //Test Case/Method
	{
		Reporter.log("Running TC4",true);
	}
	

}
