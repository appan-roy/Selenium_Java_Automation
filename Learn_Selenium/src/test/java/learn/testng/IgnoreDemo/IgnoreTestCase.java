package learn.testng.IgnoreDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//IGNORING TESTS AT CLASS LEVEL
//@Ignore
public class IgnoreTestCase {
	
//	IGNORING TESTS AT TEST LEVEL
	@Ignore
	@Test(groups={"sanity"})
	public void test1(){
		
		System.out.println("This is test case 1");
		
	}
	
	@Test(groups={"sanity", "smoke"})
	public void test2(){
		
		System.out.println("This is test case 2");
		
	}
	
	@Test(groups={"regression"})
	public void test3(){
		
		System.out.println("This is test case 3");
		
	}

}
