package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword10 {
	
	@Test                               
	public void login()             //Test Case/Method
	{
		Assert.fail();
		Reporter.log("login TC",true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()             //Test Case/Method    
	{
		
		Reporter.log("logout TC",true);
	}
	
	

}
