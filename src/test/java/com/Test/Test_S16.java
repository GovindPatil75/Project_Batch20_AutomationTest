package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_S16 {

	public static void main(String[] args) {

		//Browser Open
				//WebDriverManager.chromedriver().setup();
				  System.setProperty("webdriver.chrome.driver", 
						  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
				  
				  WebDriver driver=new ChromeDriver();
			      driver.get("https://www.facebook.com/");
			      driver.manage().window().maximize();
			      
			      // WebElement --Uppercase data send --using keyboard
			      
			      Actions act=new Actions(driver);
			      
			      WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
			   
			      //Shift--Data--Shift
			      act.keyDown(email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
			      
			      
			      //ctrl +a
			      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			      
			      //ctrl+c
			      
			      act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			      
			      //element click
			      driver.findElement(By.xpath("//input[@id='pass']")).click();
			      
			      //ctrl+v
			      act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
