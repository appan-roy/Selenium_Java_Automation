package readDataTechniques;

import library.ExcelDataConfig;

public class ReadDataUsingPOI {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\Read Data_POI.xlsx", "DataSheet");
		
		System.out.println(excel.getData(0, 0));
		
	}

}
