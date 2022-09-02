package learn.testng.AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	// Hard Assert throws an AssertExceptionimmediately when an assert statement fails and test suite continues with next @Test //
	// stop on failure
	
	@Test
	public void test1(){
		
		Assert.assertEquals(12, 13);
	
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(22, 23, "Number doesn't match");
	}
	
	@Test
	public void test3(){
		System.out.println("Test Case Started");
		Assert.assertEquals(32, 33, "Number doesn't match");
		System.out.println("Test Case Completed");
	}
	
	@Test
	public void test4(){
		
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void test5(){
		
		Assert.assertTrue(false);
		
	}
}
