package databaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTesting {

	static WebDriver driver;
	static String driverProp = "webdriver.chrome.driver";
	static String driverPath = "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.setProperty(driverProp, driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

		// connect mysql database
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root",
				"MySQL_DB_USER#_01");
		System.out.println("Connected to MySQL DB");

		// create statement object
		Statement statement = connect.createStatement();

		// run sql query
		ResultSet result = statement.executeQuery("select * from t_sel_input_form");

		// get data
		while (result.next()) {
			
			String first_name = result.getString("FIRST_NAME");
			WebElement fname = driver.findElement(By.name("first_name"));
			fname.clear();
			fname.sendKeys(first_name);

			String last_name = result.getString("LAST_NAME");
			WebElement lname = driver.findElement(By.name("last_name"));
			lname.clear();
			lname.sendKeys(last_name);

			String email_id = result.getString("EMAIL");
			WebElement email = driver.findElement(By.name("email"));
			email.clear();
			email.sendKeys(email_id);
			
			String phone_no = result.getString("PHONE");
			WebElement phone = driver.findElement(By.name("phone"));
			phone.clear();
			phone.sendKeys(phone_no);
			
			String full_address = result.getString("ADDRESS");
			WebElement address = driver.findElement(By.name("address"));
			address.clear();
			address.sendKeys(full_address);
			
			String city_name = result.getString("CITY");
			WebElement city = driver.findElement(By.name("city"));
			city.clear();
			city.sendKeys(city_name);
			
			String state_name = result.getString("STATE");
			Select select = new Select(driver.findElement(By.name("state")));
			select.selectByVisibleText(state_name);
			
			String zip_code = result.getString("ZIP");
			WebElement zip = driver.findElement(By.name("zip"));
			zip.clear();
			zip.sendKeys(zip_code);
			
			String site = result.getString("WEBSITE");
			WebElement website = driver.findElement(By.name("website"));
			website.clear();
			website.sendKeys(site);
			
			String host = result.getString("HOSTING");
			if(host.equals("Yes")) {
				WebElement host_yes = driver.findElement(By.xpath("//*[@name='hosting'][@value='yes']"));
				host_yes.click();
			}else {
				WebElement host_no = driver.findElement(By.xpath("//*[@name='hosting'][@value='no']"));
				host_no.click();
			}
			
			String cmnt = result.getString("COMMENT");
			WebElement comment = driver.findElement(By.name("comment"));
			comment.clear();
			comment.sendKeys(cmnt);
			
			driver.findElement(By.cssSelector(".btn")).submit();
			
		}
		
		// close the db connection
		connect.close();

		driver.quit();

	}

}
