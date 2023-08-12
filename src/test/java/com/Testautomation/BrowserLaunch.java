package com.Testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	
    WebDriver driver;
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) {
		System.out.println("Browser Open");
		
		//Case 1
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			//Executable Setup 
			System.setProperty("webdriver.chrome.driver", 
					  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
			  
			driver=new ChromeDriver();
		}
		//case 2
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		//Case 3 -FireFox
		
		else if(BrowserName.equalsIgnoreCase("FireFox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Browser Close");
		driver.close();
	}

}
