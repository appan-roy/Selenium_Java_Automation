package readDataTechniques;

import java.io.File;

import jxl.Workbook;

public class ReadDataUsingJXL {

	public static void main(String[] args) throws Exception {
		
		File src = new File("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\Read Data_JExcel.xls");
		
		Workbook wb = Workbook.getWorkbook(src);
		
		int rowcount = wb.getSheet("Data").getRows();
		
		for(int i = 0; i < rowcount; i++) {
			
			String data = wb.getSheet("Data").getCell(0, i).getContents();
			
			System.out.println("The data is "+data);
			
		}
				
	}

}
