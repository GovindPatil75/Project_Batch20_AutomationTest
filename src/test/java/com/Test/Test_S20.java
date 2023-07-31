package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S20 {

	public static void main(String[] args) {

		//Browser Open
				//WebDriverManager.chromedriver().setup();
		         System.setProperty("webdriver.chrome.driver", 
						  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
				  
		         WebDriver driver=new ChromeDriver();
		         driver.get("https://ui.vision/demo/webtest/frames/");
		         driver.manage().window().maximize();
		         
		         // Mainpage -->Frame1 --->Mainpage
		         //Mainpage--Frame1--->Mainpage ---Frame2
		         
		         //driver.switchto().frame();
		         WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		         
		         //driver.switchTo().frame(0); // index 
		         driver.switchTo().frame(frame1); // WebElement element 
		         
		         driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test123");
		         
		         driver.switchTo().defaultContent(); // Switch mainpage 
		         
		         driver.switchTo().frame(1); // 
		         
		         driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test@123");
		         
		         
	}

}
