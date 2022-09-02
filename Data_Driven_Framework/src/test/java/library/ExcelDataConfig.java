package library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath, String sheetName) {
		
		try {
			File src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
			sheet = wb.getSheet(sheetName);
		} 
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} 
		
	}
	
	
	public String getData(int row, int col) {
		
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		
		return data;
		
	}
	
	
	public int getRowCount(String sheetName) {
		
		int lastRowIndex = wb.getSheet(sheetName).getLastRowNum();
		
		int total_row = lastRowIndex+1;
		
		return total_row;
		
	}
	
	
	
}
