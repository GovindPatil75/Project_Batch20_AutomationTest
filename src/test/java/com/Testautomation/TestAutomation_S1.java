package com.Testautomation;

import org.testng.annotations.Test;

public class TestAutomation_S1 {
	
	@Test
    public void verifyTest1() throws InterruptedException {
		
		System.out.println("Hello World");
		Thread.sleep(100);
	}
	
	@Test
	public void verifyTest2() {
		
		System.out.println("BugSpotter");
	}
	
	@Test
	public void verifyTest3() {
		
		System.out.println("Test 3");
	}
}
