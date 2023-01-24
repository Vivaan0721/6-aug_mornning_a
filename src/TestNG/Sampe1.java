package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe1 {
	
	@Test
	 public void TC1()  //Test Case/Method
	 {
		String ExpectedResult="Hi";
				
		String ActualResult="Hi";
		
		Assert.assertEquals(ExpectedResult, ActualResult);//Hi   Hi-->Pass
	 }
		@Test
		 public void TC2()
		 {
			String ExpectedResult="Hellow";
					
			String ActualResult="Hi";
			
			Assert.assertEquals(ExpectedResult, ActualResult);//Hi   Hello-->fail
			
		

		
		
	 }

		
		
	 

}
