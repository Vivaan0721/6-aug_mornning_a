package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe6 {
	

	@Test
	 public void TC1()   //Test Case/Method
	 {
						
		String str=null;
		
		Assert.assertNotNull(str); //null--->Fail
		
		
	 }

	@Test
	public void TC2()    //Test Case/Method
	
	{
		String str="abc@gmail.com";
		
		Assert.assertNotNull(str);     //abc@gmail.com--->Pass
		
	}

	
}
