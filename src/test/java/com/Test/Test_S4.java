package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S4 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Navigate 
		driver.navigate().to("file:///C:/Users/Dell/OneDrive/Desktop/frame.html");

		Thread.sleep(2000); // 2 sec
		driver.navigate().back();
		
		Thread.sleep(2000); // 2 sec
		
		driver.navigate().forward();
		
		Thread.sleep(5000); // 5 sec
		
		driver.navigate().refresh();
		
		
		
		
		
	}

}
