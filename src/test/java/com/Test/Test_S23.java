package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;

public class Test_S23 {

	public static void main(String[] args) throws Exception {
		//WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        String Dataemail=Library.excelTestData_String("Sheet1", 0, 0);
        
        String data=Library.excelTestData_Numeric("Sheet1", 0, 3);
        System.out.println(data);
        // Email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Dataemail);
        
       
	}

}
