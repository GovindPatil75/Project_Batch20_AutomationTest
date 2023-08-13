package com.Testautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomation_S11 {

	@Test
	public void verifym1() {
		
		System.out.println("Email -Test@gmail.com");
		System.out.println("Password -12345678");
		System.out.println("Login Button click");
		
		//Verify
		//String TitleHomepage=driver.gettitle(); // ABC /Xyz
		
		//String ExpectedTitle="Xyz";
		
		String Actual="ABC";
		String Expected="Xyz";
		
		//Verify
		Assert.assertEquals(Actual, Expected); //
		
		System.out.println("Payment Button click");
		System.out.println("download click");
		
		
	}
}
