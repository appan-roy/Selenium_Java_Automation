package emailDemo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {
		
		
//		Manage access to less secure apps
//		Sign in to your Google Admin console. ...
//		From the Admin console Home page, go to Security Basic settings. ...
//		Under Less secure apps, select Go to settings for less secure apps.
//		On the left, select an organizational unit where you want to manage access to less secure apps.
//		Turn it ON.
		
		
		System.out.println("Email trigger activated");
		
		Email email = new SimpleEmail();
		
		email.setHostName("smtp.gmail.com");
		
		email.setSmtpPort(465);
		
		email.setAuthenticator(new DefaultAuthenticator("kripeshroy@gmail.com", "Roy.krips19"));
		
		email.setSSLOnConnect(true);
		
		email.setFrom("kripeshroy@gmail.com");
		
		email.setSubject("Selenium Test Report");
		
		email.setMsg("This is a test mail from Selenium");
		
		email.addTo("appan12345@gmail.com");
		
		email.send();
		
		System.out.println("Email sent successfully");

	}

}
