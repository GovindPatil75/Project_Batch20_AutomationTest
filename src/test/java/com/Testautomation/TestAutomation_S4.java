package com.Testautomation;

import org.testng.annotations.Test;

public class TestAutomation_S4 extends BaseClass{
	
	
	@Test(priority=1)
	public void xyz() {
		System.out.println("Test xyz");
	}
	
	@Test(priority=2)
	public void pqr() {
		System.out.println("Test pqr");
	}
	
	@Test(priority=-1)
	public void abc() {
		System.out.println("Test abc");
	}

}
