package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S18 {

	public static void main(String[] args) {
		//Browser Open
				//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", 
						  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
				  
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/popup.php");
	    driver.manage().window().maximize();
	    
	    //We need parent window id 
	    
	    String ParentWindow=driver.getWindowHandle();
	    System.out.println(ParentWindow);
	    
	    driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	    
	    //Parent + Child window ID 
	    Set<String> AllId=driver.getWindowHandles();
	    
	    List<String> list=new ArrayList(AllId);
	    
	    System.out.println(AllId);
	    System.out.println(list.get(0));
	    System.out.println(list.get(1));
	    
	    driver.switchTo().window(list.get(1)); // Switch Child window 
	    
	    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
	    
	    //driver.close();
	    //driver.quit();
	    
	    driver.switchTo().window(ParentWindow);
	    
	    driver.quit();
	    
	}

}
