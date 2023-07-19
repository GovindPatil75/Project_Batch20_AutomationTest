package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S9 {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://demo.guru99.com/test/newtours/register.php");
      driver.manage().window().maximize();
      
      //Drop Down Handle 
      
      // identify dropDown WebElement 
      WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
      /*
      // create object of Select Class 
      Select sel=new Select(drp_country);

      //by using selectByIndex select the dropdown option 
      sel.selectByIndex(10);
      
    //by using selectByValue select the dropdown option
      sel.selectByValue("AMERICAN SAMOA");
      
    //by using selectByVisibleText select the dropdown option
      sel.selectByVisibleText("ARGENTINA");
      */
      
      handleDropDown_selectByVisibleText(drp_country,"ARGENTINA");
      
      handleDropDown_selectByValue(drp_country,"AMERICAN SAMOA");
      
      handleDropDown_selectByIndex(drp_country,12);
      
	}

	
	public static void handleDropDown_selectByVisibleText(WebElement element,String text) {
		 // create object of Select Class 
	      Select sel=new Select(element);
	      //by using selectByVisibleText select the dropdown option
	      sel.selectByVisibleText(text);
	}
	
	public static void handleDropDown_selectByValue(WebElement element,String value) {
		 // create object of Select Class 
	      Select sel=new Select(element);
	      //by using selectByValue select the dropdown option
	      sel.selectByValue(value);
	}
	
	public static void handleDropDown_selectByIndex(WebElement element,int value) {
		 // create object of Select Class 
	      Select sel=new Select(element);
	      //by using selectByIndex select the dropdown option
	      sel.selectByIndex(value);
	}
}
