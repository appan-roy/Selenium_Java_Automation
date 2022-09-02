package learn.testng.DependencyDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodDependency {

	@Test
	public void startApp(){
		Assert.assertEquals(false, true);
		System.out.println("Starting app");
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp(){
		System.out.println("Login to app");
	}
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp(){
		System.out.println("Logout from app");
	}

}
