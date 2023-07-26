package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_S14 {

	public static void main(String[] args) {

		//Browser Open
				//WebDriverManager.chromedriver().setup();
				  System.setProperty("webdriver.chrome.driver", 
						  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
				  
				  ChromeDriver driver=new ChromeDriver();
			      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			      driver.manage().window().maximize();
			      
			      //Right click +Quit click
			      //for right click -we have contextClick method
			      
			      Actions act=new Actions(driver);
			      
			      WebElement rightclickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
			      WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
			      //Right click +Quit click
			     // act.contextClick(rightclickElement).click(quit).build().perform();
			      
			      WebElement doubleclickelement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

			      act.doubleClick(doubleclickelement).build().perform();
			      
			     // getActions(driver).doubleClick(doubleclickelement).build().perform();
	}

	
	public static void MoveToelement_Click(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		
	}
}
