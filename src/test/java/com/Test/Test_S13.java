package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_S13 {

	public static void main(String[] args) {

      //Browser Open
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
		  ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/drag_drop.html");
	      driver.manage().window().maximize();
	      
	      
	      //Actions --- mouseActions and Keyboard action handle 
	      
	      Actions act=new Actions(driver);
	      WebElement Selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
	      //mousehover+Click
	      act.moveToElement(Selenium).click().build().perform();
	      
	      
	      
	      

	}

}
