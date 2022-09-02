package learn.testng.AssertionDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	// Soft Assert collects errors during @Test. Soft Assert does not throw an exception when an assert fails and would continue with the next step after the assert statement //
	// continue on failure
	
	@Test
	public void testSoft(){
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test case started");
		assertion.assertEquals(13, 12, "Test case failed");
		System.out.println("Test case completed");
		assertion.assertAll();
	}

}
