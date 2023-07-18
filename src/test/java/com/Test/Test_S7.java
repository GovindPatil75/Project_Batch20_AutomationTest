package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S7 {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      
      //identify element - Relative Xpath --> Attribute
      //tagname[@attributename='value']
      
      WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
      email.sendKeys("Test@gmail.com");
      
      WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
      password.sendKeys("123456789");
      
      WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
      loginbutton.click();
      

	}

}
