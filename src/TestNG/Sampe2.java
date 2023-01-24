package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe2 {
	
	@Test
	 public void TC1()  //Test Case/Method
	 {
		String ExpectedResult="Hi";
				
		String ActualResult="Hi";
		
		Assert.assertNotEquals(ExpectedResult, ActualResult);//Hi   Hi-->Fail
	 }
		@Test
		 public void TC2()
		 {
			String ExpectedResult="Hellow";
					
			String ActualResult="Hi";
			
			Assert.assertNotEquals(ExpectedResult, ActualResult);//Hi   Hello-->Pass
			
		

		
		
	 }

}
