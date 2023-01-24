package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe3 {
	

	@Test
	 public void TC1()   //Test Case/Method
	 {
						
		boolean ActualResult=true;
		
		Assert.assertTrue(ActualResult);    //true--->Pass
		
		
	 }
		@Test
		public void TC2()   //Test Case/Method
		
		{
			boolean ActualResult=false;
			
			Assert.assertTrue(ActualResult);  //false---> Pass
			
		}
		

	
}
