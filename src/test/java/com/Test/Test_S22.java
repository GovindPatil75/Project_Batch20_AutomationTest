package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_S22 {

	public static void main(String[] args) throws Exception {

      String Filepath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
      
      String path=System.getProperty("user.dir");
      System.out.println(path);
      //Object create 
      FileInputStream fis=new FileInputStream(Filepath);
      
      //Object Create XSSFWorkbook
      XSSFWorkbook wb=new XSSFWorkbook(fis);
      
      String Data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
      
      System.out.println(Data_0_0);
      
      String Data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
      
       System.out.println(Data_0_1);
       
       
       //Browser Open
     //Browser Open
     		//WebDriverManager.chromedriver().setup();
              System.setProperty("webdriver.chrome.driver", 
     				  "C:\\Users\\Dell\\eclipse-workspace\\Project_Batch20_AutomationTest\\Driver\\chromedriver.exe");
     		  
              WebDriver driver=new ChromeDriver();
              driver.get("https://www.facebook.com/");
              driver.manage().window().maximize();
              
              // Email
              driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Data_0_0);
              
              //Password
              driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Data_0_1);
             
       
       
	}

}
