package rerunFailedCasesDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedCase {
	
	@Test
	public void test1(){
		
		System.out.println("This is test case 1");
		
	}
	
	@Test
	public void test2(){
		
		System.out.println("This is test case 2");
		
		Assert.assertTrue(5>6);
		
	}
	
	@Test(retryAnalyzer = rerunFailedCasesDemo.RetryAnalyzer.class)
	public void test3(){
		
		System.out.println("This is test case 3");
		
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void test4(){
		
		System.out.println("This is test case 4");
		
	}

}
