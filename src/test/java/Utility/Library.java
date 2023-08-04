package Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {

	public static String excelTestData_String(String Sheetname,int row,int cell) throws Exception {
		
		String Filepath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
	    FileInputStream fis=new FileInputStream(Filepath); 
	    //Object Create XSSFWorkbook
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	      
	}
	
   public static String excelTestData_Numeric(String Sheetname,int row,int cell) throws Exception {
		
		String Filepath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
	    FileInputStream fis=new FileInputStream(Filepath); 
	    //Object Create XSSFWorkbook
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    double Data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
	    return String.valueOf(Data).replace(".0", "");
	}
}
