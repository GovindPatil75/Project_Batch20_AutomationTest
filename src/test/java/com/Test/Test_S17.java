package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S17 {

	public static void main(String[] args) throws Exception {
		//Browser Open
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/delete_customer.php");
	      driver.manage().window().maximize();
	      
	      //Identify customer WebElement 
	      WebElement customerId=driver.findElement(By.xpath("//input[@name='cusid']"));
	      customerId.sendKeys("1234567");
	      
	      //submit click
	      WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	      submit.click();
	      
	     
	      Alert alt=driver.switchTo().alert();
	      
	      //String textAlert=driver.switchTo().alert().getText();
	      
	      String textAlert=alt.getText();
	      
	      System.out.println(textAlert);
	      
	      //alt.accept(); //click Ok button
	      alt.dismiss(); // click cancel button 
	      
	      Thread.sleep(2000);
	      
	      String textAlert2=alt.getText();
	      System.out.println(textAlert2);
	      
	      alt.accept(); //Alert 2 Ok button 
	      
	      /*
	      HandleAlert(driver).getText();
	      HandleAlert(driver).accept();
	      HandleAlert(driver).dismiss();
	      HandleAlert(driver).sendKeys("12345678");
	      */

	}

	public static Alert HandleAlert(WebDriver driver) {
		
		return driver.switchTo().alert();
	}
	
	
}
