package utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CsvUtils {

	FileReader fileReader;
	CSVReader csvReader;
	CSVWriter csvWriter;

	public int getRowCount(String csvFilePath) throws CsvValidationException, IOException {

		int rowCount = 0;

		fileReader = new FileReader(csvFilePath);
		csvReader = new CSVReader(fileReader);
		while (csvReader.readNext() != null) {
			rowCount++;
		}

		return --rowCount;

	}

	public int getColumnCount(String csvFilePath) throws CsvValidationException, IOException {

		int columnCount = 0;
		String[] header = null;

		fileReader = new FileReader(csvFilePath);
		csvReader = new CSVReader(fileReader);
		header = csvReader.readNext();
		if (header != null)
			columnCount = header.length;

		return columnCount;

	}

	public List<List<String>> getCsvData(String csvFilePath, String firstColumnHeader)
			throws IOException, CsvValidationException {

		List<List<String>> csvData = new ArrayList<List<String>>();
		fileReader = new FileReader(csvFilePath);
		csvReader = new CSVReader(fileReader);
		String[] nextRecord;

		while ((nextRecord = csvReader.readNext()) != null) {
			if (!nextRecord[0].equals(firstColumnHeader)) {
				List<String> csvRecord = new ArrayList<String>();
				for (String data : nextRecord) {
					csvRecord.add(data);
				}
				csvData.add(csvRecord);
			}
		}

		csvReader.close();

		return csvData;

	}

	public void writeDataToCsvFile(String csvFilePath, List<String> csvRecord, String dataToWrite) throws IOException {

		csvWriter = new CSVWriter(new FileWriter(csvFilePath, true));
		csvRecord.add(dataToWrite);
		String[] record = new String[csvRecord.size()];
		for (int i = 0; i < record.length; i++) {
			record[i] = csvRecord.get(i);
		}
		csvWriter.writeNext(record);
		csvWriter.close();

	}

}
