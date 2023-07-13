package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identify WebElement
		
		//Email Address +SendKeys
		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		//Password + SendKeys
		driver.findElement(By.id("pass")).sendKeys("12345678");
		//login button +Click
		driver.findElement(By.name("login")).click();
		
		//verify
		String title=driver.getTitle(); // HomePage
		
		System.out.println(title);
		
		if(title.equals("XYZ")) {
			System.out.println("Test Case Pass");
		}else {
			
			System.out.println("Test Case Fail");
		}
		
	}

}
