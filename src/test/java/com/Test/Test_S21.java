package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S21 {

	public static void main(String[] args) {
		//Browser Open
		//WebDriverManager.chromedriver().setup();
         System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
         WebDriver driver=new ChromeDriver();
         driver.get("https://ui.vision/demo/webtest/frames/");
         driver.manage().window().maximize();
         
         //Mainpage-->Outterframe--->Innerframe
         WebElement Outterframe=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

         //Mainpage -->OutterFrame
         driver.switchTo().frame(Outterframe); 
         
         driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test@123");
         
         //Outterframe --->innerframe
         WebElement innerframe=driver.findElement(By.tagName("iframe"));
         driver.switchTo().frame(innerframe);
         
         String text=driver.getTitle();
         System.out.println(text);
         
         //Innerframe-->Outerframe-->Mainpage
         
         //Innerframe-->Outerframe
         driver.switchTo().parentFrame();
         
         //Outerframe-->Mainpage
         driver.switchTo().defaultContent();
         
         WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
         
         driver.switchTo().frame(frame4);
         driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Test@123");
         
         
         
         
	}

	public static void HandleFrame(WebDriver driver,WebElement element) {
		try {
		     driver.switchTo().frame(element); // Mainapge -->Frame
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}
