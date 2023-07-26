package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_S15 {

	public static void main(String[] args) {
		
		//Browser Open
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/drag_drop.html");
	      driver.manage().window().maximize();
	      
	      //WebElement ---Src ---Destn
	      
	      //Actions act=new Actions(driver);
	      
	      WebElement src_Element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	      
	      WebElement destn_Element=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	      
	     // act.dragAndDrop(src_Element, destn_Element).build().perform();
	      
	      HandleDrag_DropAction(driver,src_Element,destn_Element);

	}

	public static void HandleDrag_DropAction(WebDriver driver,WebElement src,WebElement destn) {
		
		Actions action=new Actions(driver);
		action.dragAndDrop(src, destn).build().perform();
		
	}
	
}
