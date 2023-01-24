package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword8 {
	
	@Test                               
	public void login()             //Test Case/Method
	{
		
		Reporter.log("login TC",true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()             //Test Case/Method    
	{
		Reporter.log("logout TC",true);
	}
	
	

}
