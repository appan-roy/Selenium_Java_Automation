package learn.testng.DependencyDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups={"End to End Test"})
public class GroupingDependency {
	
	@Test(groups={"sanity"})
	public void test1(){
		System.out.println("This is test case 1");
		Assert.assertEquals(10, 11);
	}
	
	@Test(dependsOnGroups= {"sanity"})
	public void test2(){
		System.out.println("This is test case 2");
	}
	
	@Test(dependsOnGroups= "sanity")
	public void test3(){
		System.out.println("This is test case 3");
	}
	
	@Test
	public void test4(){
		
		System.out.println("This is test case 4");
		
	}

}
