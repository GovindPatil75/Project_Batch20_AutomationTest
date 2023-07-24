package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S12 {

	public static void main(String[] args) throws Exception {
		
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
		  ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();

	      /*
	      //Scrolling  pixel
	      JavascriptExecutor js=driver;
	      
	      //top to bottom 
	      js.executeScript("window.scrollBy(0,500)", "");
	      
	      Thread.sleep(3000);
	      
	      //bottom to up 
	      js.executeScript("window.scrollBy(0,-500)", "");
	      
	      Thread.sleep(3000);
	      //Scroll using webelement
	      
	      */
	      WebElement English_uk=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	      //js.executeScript("arguments[0].scrollIntoView();", English_uk);
	      
	      ScrolltoElement(driver,English_uk);
	}

	public static void ScrolltoElement(ChromeDriver driver,WebElement element) {
		
		JavascriptExecutor js= driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
