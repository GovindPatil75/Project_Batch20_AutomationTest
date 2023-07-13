package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// WebElement identify --Id ,Name 
		
		WebElement email=driver.findElement(By.id("email"));
		
		WebElement password=driver.findElement(By.id("pass"));

//		boolean value=email.isEnabled();
//		
//		boolean value1=email.isDisplayed();
//		
//		System.out.println(value); // true
//		
//		if(value==true && value1==true) {
//			email.sendKeys("Test@gmail.com");
//		}else {
//			System.out.println("Email filed is disabled");
//		}
		
		SendValueToElement(email,"Test@gmail.com");
		SendValueToElement(password,"123456789");
		//clickonElement();
	}

public static void SendValueToElement(WebElement element,String value) {
	
	if(element.isDisplayed() && element.isEnabled()) {
		element.sendKeys(value);
	}else {
		System.out.println("Email field is not dispalyed or disabled");
	}
	
}

public static void clickonElement(WebElement element) {
	if(element.isDisplayed() && element.isEnabled()) {
		element.click();
	}else {
		System.out.println("Email field is not dispalyed or disabled");	
	}
	
}	
	
}
