package TestNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sampe8 {
	
	@Test
	public void TC1()                    //Test Case/Method
	{
	
		SoftAssert soft=new SoftAssert();
		
		String S1="Hi";
		
		String S2="Hello";
		
		String S3="Good Morning";
		
		soft.assertNotEquals(S1, S3); //Pass
		soft.assertEquals(S1, S2);        //Hi  Hello-->fail
		
		soft.assertNotEquals(S1, S2);  //Hi   Hello-->Pass
		
		soft.assertEquals(S1, S3);  //Fail
		
		soft.assertNotEquals(S1, S3); //Pass
		
	soft.assertAll();
		
		
		
		
		
		
		
		
		
		
		
	}
	
		

}
