package learn.cucumber.stepDefinition;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DataTableHandling {

	@Then("Read the below users details")
	public void user_enters_credential_to_login(DataTable userDetails) throws InterruptedException {

		List<List<String>> data = userDetails.cells();

		int rows = data.size();
		int columns = data.get(0).size();

		System.out.println(rows);
		System.out.println(columns);

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				System.out.println(data.get(i).get(j));

			}

		}

	}

}
