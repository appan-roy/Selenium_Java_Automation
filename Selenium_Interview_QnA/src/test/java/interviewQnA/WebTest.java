package interviewQnA;

import org.testng.annotations.Test;

public class WebTest {
	
	private String myBrowser;

	public WebTest(String browser) {
		myBrowser = browser;
	}

	@Test
	public void testServer() {
		System.out.println("Test "+myBrowser);
	}

}
