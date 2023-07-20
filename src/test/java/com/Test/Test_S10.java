package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S10 {

	public static void main(String[] args) {
		
		  //WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
		  
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/newtours/register.php");
	      driver.manage().window().maximize();
	      
	      //identify dropdown webelement
	      WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	      
	      // Create the Object of Select class
	      Select sel=new Select(drp_country);
	      
	      WebElement defaultelement=sel.getFirstSelectedOption();
	      System.out.println(defaultelement.getText());
	      
	      List<WebElement> list=sel.getOptions();
	      
	      // print count of dropdown Option 
	      System.out.println("Count of Dropdown Option=="+list.size()); // 264
	      
	      //Print all dropdown Option
	      
	      for(int i=0;i<list.size();i++) {
	    	  
	    	  String DrpElement=list.get(i).getText();
	    	  System.out.println(DrpElement);
	    	  
	    	  if(DrpElement.equals("TURKEY")) {
	    		  
	    		  list.get(i).click();
	    		  break;
	    	  }
	      }
	      
	      

	}

}
