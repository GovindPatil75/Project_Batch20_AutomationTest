package com.Testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAutomation_S3 extends BaseClass {
	
	
	
	@Test
	public void VerifyTest1() {
		//driver.switchto().frame();
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        
        //driver.switchTo().frame(0); // index 
        driver.switchTo().frame(frame1); // WebElement element 
        
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test123");
        driver.switchTo().defaultContent(); // Switch mainpage
	}
	@Test
	public void VerifyTest2() {
		 
        driver.switchTo().frame(1); // 
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test@123");
	}
	
	@Test
	public void abc() {
		 
        System.out.println("Test 3");
	}
	
	

}
