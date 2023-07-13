package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S2 {

	public static void main(String[] args) {
		
		// Automation Script 
		//SC->WD->RWC->BROWSER Driver (CD,SD,ED)
		//Chrome
		WebDriverManager.chromedriver().setup(); // Set Executable Chrome Browser
		ChromeDriver driver=new ChromeDriver();  // Browser Object created
		driver.get("https://www.facebook.com/"); // we call the get(url) method
		driver.manage().window().maximize();
		//close window 
		driver.close(); // current window open -close

		//Edge
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		//close
		driver1.close();
		
	}

}
