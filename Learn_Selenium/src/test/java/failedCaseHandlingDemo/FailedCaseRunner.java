package failedCaseHandlingDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedCaseRunner {

	public static void main(String[] args) {
		
		TestNG runner = new TestNG();
		
		List<String> list = new ArrayList<String>();
		
		list.add("E:\\Softwares\\My PC Apps\\Selenium\\Workspace\\LearnSelenium\\test-output\\Smoke Scenarios\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();

	}

}
