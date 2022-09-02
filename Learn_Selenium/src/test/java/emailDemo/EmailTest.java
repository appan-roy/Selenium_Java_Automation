package emailDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class EmailTest {
	
  @Test
  public void Test1() {
	  
	 int a = 90;
	 
	 int b = 90;
	 
	 Assert.assertEquals(a, b);
	 
	 System.out.println("Test is ended");
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Test is started");
	  
  }

  @AfterClass
  public void afterClass() throws EmailException {
	  
	  SendEmail2.sendEmail();
	  
  }

}
