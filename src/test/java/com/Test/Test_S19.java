package com.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S19 {

	public static void main(String[] args) {
		//Browser Open
		//WebDriverManager.chromedriver().setup();
         System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
         WebDriver driver=new ChromeDriver();
         driver.get("https://demo.guru99.com/popup.php");
         driver.manage().window().maximize();
         
         String ParentWindow=driver.getWindowHandle(); // Parent window ID //ABC
         
         driver.findElement(By.xpath("//a[text()='Click Here']")).click();
         
         Set<String> AllID=driver.getWindowHandles(); // Parent + Child window ID
         
         Iterator<String> IT=AllID.iterator();
         
         while(IT.hasNext()) {
        	 
        	 String ChildWindowID=IT.next(); // ABC //XYZ
        	 
        	 if(!ParentWindow.equals(ChildWindowID)) {
        		
        		 driver.switchTo().window(ChildWindowID); // Switch Child Window
        		 
        		 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
        		 
        	 }
         }
         
         driver.switchTo().window(ParentWindow); // Switch Parent Window 
         driver.quit(); // Current + All Open window Close 
         
         

	}

}
