package csvFileHandling;

import java.io.IOException;
import java.util.List;

import com.opencsv.exceptions.CsvValidationException;

import utilities.CsvUtils;

public class CSVReadWrite {

	public static void main(String[] args) throws CsvValidationException, IOException {
		
		String csvFilePath = "./CSVFiles/MyCsvFile.csv";
		
		CsvUtils csv = new CsvUtils();
		
		// get total no. of rows
		System.out.println(csv.getRowCount(csvFilePath));
		
		// get total no. of columns
		System.out.println(csv.getColumnCount(csvFilePath));
		
		// csv read write
		List<List<String>> myCsvData = csv.getCsvData(csvFilePath, "FirstName");
		for (List<String> records : myCsvData) {
			for (String rec : records) {
				System.out.print(rec + " ");
			}
			csv.writeDataToCsvFile(csvFilePath, records, "Done");
			System.out.println();
		}

	}

}
