package failedCaseHandlingDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Instagram {

	@Test
	public void instaTest(){
		
		Assert.assertTrue(false);
		
		System.out.println("The instagram test passed");
		
	}
}
