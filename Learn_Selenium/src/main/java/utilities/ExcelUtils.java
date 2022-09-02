package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	File file;
	Workbook workbook;
	Sheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		
		file = new File(excelPath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		String fileExtensionName = excelPath.substring(excelPath.indexOf("."));
		
		if (fileExtensionName.equals(".xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (fileExtensionName.equals(".xls")) {
			workbook = new HSSFWorkbook(inputStream);
		}
 
		sheet = workbook.getSheet(sheetName);
		
	}
	
	public ExcelUtils(String excelPath, int sheetIndex) throws IOException {
		
		file = new File(excelPath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		String fileExtensionName = excelPath.substring(excelPath.indexOf("."));
		
		if (fileExtensionName.equals(".xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (fileExtensionName.equals(".xls")) {
			workbook = new HSSFWorkbook(inputStream);
		}
 
		sheet = workbook.getSheetAt(sheetIndex);
		
	}
	
	public int getRowCount() {	
		return (sheet.getLastRowNum() - sheet.getFirstRowNum());
	}
	
	public int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	
	public Object getCellData(int rowNum, int colNum) {
		DataFormatter df = new DataFormatter();
		Object data = df.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		return data;
	}
	
	public void writeDataToCell(int existingRowNum, int newColNum, String dataToWrite) throws IOException {
		sheet.getRow(existingRowNum).createCell(newColNum).setCellValue(dataToWrite);
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
	}
	
}