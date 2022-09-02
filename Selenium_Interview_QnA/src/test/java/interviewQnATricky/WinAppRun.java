package interviewQnATricky;

import java.io.IOException;

public class WinAppRun {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime runTime = Runtime.getRuntime();
		
		// open notepad
		Process process = runTime.exec("notepad.exe C:\\Users\\APPAN\\Desktop\\Git Integration Using Command Prompt.txt");
		Thread.sleep(2000);
		process.destroy();
		
		// open browser
		String[] strArr = {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.co.in/"};
		Process pr = runTime.exec(strArr);
		Thread.sleep(2000);
		pr.destroy();

	}

}
