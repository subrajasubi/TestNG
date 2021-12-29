package week5.day1.testng.testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xcel {
	
	public ChromeDriver driver;
    
	public static String[][] readExcel(String fileName) throws IOException {
		
		
		 
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		System.out.println(rowCount);
		  
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(columnCount);
		
		 String[][] data = new String[rowCount][columnCount];
		
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j <columnCount; j++) {
				
			
			    
			    String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			    
			    System.out.println(cellValue);
			    
			    data[i-1][j] = cellValue;
			    
			  
			    
			    
				
			}
			
		}
		wb.close();
		return data;
	}
}
		
	

