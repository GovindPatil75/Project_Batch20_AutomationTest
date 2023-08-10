package com.Testautomation;

import org.testng.annotations.Test;

public class TestAutomation_S6 {
	
	@Test(groups= {"CriticalRegression"})
	public void a1() {
		System.out.println("Test A1");
	}
	
	@Test(groups= {"CriticalRegression"})
	public void a2() {
		System.out.println("Test A2");
	}
	
	@Test(groups= {"Regression"})
	public void a3() {
		System.out.println("Test A3");
	}
	
	@Test(groups= {"Regression"})
	public void a4() {
		System.out.println("Test A4");
	}

}
