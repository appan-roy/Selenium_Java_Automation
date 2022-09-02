package readDataTechniques;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\Selenium - Automation Practice Form_Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wrkbk = new XSSFWorkbook(fis);
		
		XSSFSheet sht2 = wrkbk.getSheet("ReadExcel DataSheet");
		
		int rowcount = wrkbk.getSheet("ReadExcel DataSheet").getLastRowNum();
		
		for (int i=1; i<=rowcount; i++){
				
				String fname = sht2.getRow(i).getCell(0).getStringCellValue();
				
				String lname = sht2.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(fname + " " + lname);
				
		}
		
		wrkbk.close();
		
	}

}

