package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampe7 {
	
	@Test
	 public void TC1()  //Test Case/Method
	 {
		String S1="Hi";
				
		String s2="Hellow";
		
		String s3="Good Morning";
		
		Assert.assertNotEquals(s2, S1);//Hi   Hi-->Pass
		
		Assert.assertEquals(s2, S1);
		
		Assert.assertEquals(s3, S1);
		
		Assert.assertNotEquals(s3, S1);
	 }
		

}
