package emailDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class EmailTest2 {
	
  @Test
  public void Test1() {
	  
	 int a = 90;
	 
	 int b = 100;
	 
	 Assert.assertEquals(a, b);
	 
	 System.out.println("Test is ended");
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Test is started");
	  
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  
	  if(result.getStatus() == ITestResult.FAILURE) {
		  
		  SendEmail2.sendEmail();
		  
		  System.out.println("Test is failed and email sent");
		  
	  }
	  
  }

}
