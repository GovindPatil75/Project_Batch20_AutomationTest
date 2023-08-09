package com.Testautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomation_S5 {
	
	@Test
	public void m1() {
		System.out.println("Test m1");
		//Assert.assertTrue(false);
	}
	
	@Test(invocationCount=3)
	public void m2() {
		System.out.println("Test m2");
	}
	
	@Test(enabled=false)
	public void m3() {
		System.out.println("Test m3");
	}
	
	@Test(dependsOnMethods= {"m1"})
	public void m4() {
		System.out.println("Test m4");
	}

}
