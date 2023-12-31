package com.Testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
       driver=new ChromeDriver();
       driver.get("https://ui.vision/demo/webtest/frames/");
       driver.manage().window().maximize();
       
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
