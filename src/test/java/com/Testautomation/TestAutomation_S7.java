package com.Testautomation;

import org.testng.annotations.Test;

public class TestAutomation_S7 {
	
	@Test(groups= {"CriticalRegression","Regression"})
	public void p1() {
		System.out.println("Test P1");
	}
	
	@Test(groups= {"Regression"})
	public void p2() {
		System.out.println("Test P2");
	}
	
	@Test(groups= {"Regression"})
	public void p3() {
		System.out.println("Test P3");
	}
	
	@Test(groups= {"Regression"})
	public void p4() {
		System.out.println("Test P4");
	}

}
