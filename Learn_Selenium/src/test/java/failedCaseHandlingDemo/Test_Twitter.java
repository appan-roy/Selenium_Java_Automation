package failedCaseHandlingDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Twitter {

	@Test
	public void tweetTest(){
		
		Assert.assertTrue(false);
		
		System.out.println("The twitter test passed");
		
	}
}
