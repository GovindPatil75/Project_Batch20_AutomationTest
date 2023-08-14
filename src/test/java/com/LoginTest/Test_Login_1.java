package com.LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

public class Test_Login_1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
	}
	
	@Test
	public void VerifyLogin() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.gettxt_Email().sendKeys("Test@gmail.com");
		login.gettxt_password().sendKeys("12345678");
		login.getbtn_login().click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
