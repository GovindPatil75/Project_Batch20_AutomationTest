package com.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Test_S11 {

	public static void main(String[] args) throws Exception {
		
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
		  ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/newtours/register.php");
	      driver.manage().window().maximize();
	      
	      
	     // Test_S12.ScrolltoElement(driver, null);
	      
	      Date d=new Date();
	      String date=d.toString();
	      
	      System.out.println(date);
	      
	      String d1=date.replace(" ", "_").replace(":", "_");
	      
	      String RM=RandomString.make(5); // random string ab1,8ty
	      //full page Screenshot 
	      
	      TakesScreenshot ts=driver;
	      //TakesScreenshot ts=(TakesScreenshot)driver; //WebDriver driver=new ChromeDriver();
	      File src=ts.getScreenshotAs(OutputType.FILE);
	      File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\"+d1+".png");
	      FileUtils.copyFile(src, destn);
	      /*
	      //Capture screenshot of WebElement
	      
	      WebElement logo=driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
	      File src1=logo.getScreenshotAs(OutputType.FILE);
	      File destn1=new File("C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\logo.png");
	      FileUtils.copyFile(src1, destn1);
 */
	}

}
