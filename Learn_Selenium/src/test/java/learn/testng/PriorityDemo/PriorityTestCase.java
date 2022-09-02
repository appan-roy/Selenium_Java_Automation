package learn.testng.PriorityDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTestCase {

	@Test(priority=2, description="This test case will verify login functionality")
	public void loginApplication(){
		
		System.out.println("Login to application");
		
		Assert.assertEquals(12, 10);
		
	}
	
	@Test(priority=1, description="This test case will verify the add to cart functionality")
	public void selectItems(){
		
		System.out.println("Item is selected");
		
	}
	
	@Test(priority=3, description="This test case will verify the checkout functionality")
	public void checkout(){
		
		System.out.println("Checkout completed");
		
	}

}
