package base;

import java.io.IOException;

import utilsHelper.DriverManager;

public class BaseClass extends DriverManager {
	
	public void openBrowser() {
		instantiateDriver();
	}
	
	public void closeBrowser() {
		closeDriver();
	}
	
	public void killBrowser() throws IOException {
		killDriver();
	}
	
	public void waitFor(int timeInSec) throws InterruptedException {
		Thread.sleep(timeInSec * 1000);
	}
	
}
