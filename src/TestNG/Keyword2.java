package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword2 {
	
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
	

}
