package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe5 {
	

	@Test
	 public void TC1()   //Test Case/Method
	 {
						
		String str=null;
		
		Assert.assertNull(str); //null--->pass
		
		
	 }

	@Test
	public void TC2()    //Test Case/Method
	
	{
		String str="abc@gmail.com";
		
		Assert.assertNull(str);     //abc@gmail.com--->fail
		
	}

	
}
