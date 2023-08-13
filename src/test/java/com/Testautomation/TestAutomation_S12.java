package com.Testautomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAutomation_S12 {
	
	
	@Test
	public void verifyM2()	{
		
		System.out.println("Email -Test@gmail.com");
		System.out.println("Password -12345678");
		System.out.println("Login Button");
		
		//Verify
		String Actual="ABC";
		String Expectd="XYZ";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(Actual, Expectd); //Fail
		
		System.out.println("Payment Button click");
		System.out.println("download Button click");
		
		soft.assertAll();
	}
}
