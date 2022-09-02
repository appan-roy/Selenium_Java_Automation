package learn.testng.GroupingDemo;

import org.testng.annotations.Test;

@Test(groups={"End to End Test"})
public class TestCaseGrouping {
	
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
	
	@Test
	public void test4(){
		
		System.out.println("This is test case 4");
		
	}
	
	@Test(groups={"regression", "smoke", "sanity"})
	public void test5(){
		
		System.out.println("This is test case 5");
		
	}
	
	@Test(groups={"regression", "smoke"})
	public void test6(){
		
		System.out.println("This is test case 6");
		
	}
	
	@Test(groups={"smoke"})
	public void test7(){
		
		System.out.println("This is test case 7");
		
	}
	
	@Test(groups={"regression", "sanity"})
	public void test8(){
		
		System.out.println("This is test case 8");
		
	}
	
	@Test(groups={"windows7.regression"})
	public void test9(){
		
		System.out.println("This is test case 9");
		
	}
	
	@Test(groups={"windows7.smoke"})
	public void test10(){
		
		System.out.println("This is test case 10");
		
	}
	
	@Test(groups={"windows8.regression"})
	public void test11(){
		
		System.out.println("This is test case 11");
		
	}
	
	@Test(groups={"windows8.smoke"})
	public void test12(){
		
		System.out.println("This is test case 12");
		
	}

}
