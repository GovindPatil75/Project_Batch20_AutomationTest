package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S8 {

	public static void main(String[] args) {

		  WebDriverManager.chromedriver().setup();
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      
	      //identify element by text() 
	      //tagname[text()='value']
	      
	   WebElement forgottenpassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	   forgottenpassword.click();
	      
	}

}
