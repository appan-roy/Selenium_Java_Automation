package databaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {

	@Test
	public void getAllFromDBTable() throws ClassNotFoundException, SQLException {
		
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		// connect mysql database
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "MySQL_DB_USER#_01");
		System.out.println("Connected to MySQL DB");
		
		// create statement object
		Statement statement = connect.createStatement();
		
		// run sql query
		ResultSet result = statement.executeQuery("select * from t_sel_user");
		
		// get data
		while(result.next()) {
			String userid = result.getString("USER_ID");
			System.out.println(userid);
			
			String fname = result.getString("FIRST_NAME");
			System.out.println(fname);
			
			String lname = result.getString("LAST_NAME");
			System.out.println(lname);
		}
		
		// close the db connection
		connect.close();
		
	}
	
}
