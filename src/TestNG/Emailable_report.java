package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_report {
	
	
	@Test
	public void TC1()             //Test Case/Method
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2()             //Test Case/Method
	{
		Reporter.log("Running TC2",false);
	}
	
	
	@Test
	public void TC3()             //Test Case/Method
	{
		Reporter.log("Running TC3");
	}
	
	@Test
	public void TC4()             //Test Case/Method
	{
		System.out.println("Running TC4");
	}
	

	

}
