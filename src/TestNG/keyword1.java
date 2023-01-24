package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword1 {
	
	@Test(invocationCount=10)
	public  void TC1()
	{
		
		
		Reporter.log("Running TC1",false);
	}
	

}
