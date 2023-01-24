package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe4 {
	

	@Test
	 public void TC1()   //Test Case/Method
	 {
						
		boolean ActualResult=true;
		
		Assert.assertFalse(ActualResult); //true--->fail
		
		
	 }
	@Test
	public void TC2()    //Test Case/Method
	
	{
		boolean ActualResult=false;
		
		Assert.assertFalse(ActualResult);//false--->pass
		
	}
		

	
}
