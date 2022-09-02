package interviewQnA;

import org.testng.annotations.Factory;

public class WebTestFactory {
	@Factory
	public Object[] createInstances() {
		Object[] result = new Object[3];
		String[] browser = {"chrome", "firefox", "edge"};
		for (int i = 0; i < browser.length; i++) {
			result[i] = new WebTest(browser[i]);
		}
		return result;
	}
}
