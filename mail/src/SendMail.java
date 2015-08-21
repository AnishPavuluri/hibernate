import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {
	public boolean sendMail(String toMail){
		boolean isSent = true;
		try{
			Properties properties = new Properties();
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "587");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
			Session session = Session.getDefaultInstance(properties,  new SMTPAuthenticator());
			System.out.println("------session---->"+session);
			Transport transport = session.getTransport("smtp");
			System.out.println("---transport----->"+transport);
			Message message = new MimeMessage(session);
			System.out.println("----message------->"+message);
			message.setFrom(new InternetAddress("anishpavuluri@yahoo.com"));
			message.setSubject("BID INFORMATION");
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
			message.setText("your bid amount crossed. new bid amount is Rs.1234 bid again");
			transport.send(message);
		}catch (Exception e) {
			isSent = false;
			e.printStackTrace();
		}
		return isSent;
	}
	
	private class SMTPAuthenticator extends Authenticator{
		
		public PasswordAuthentication getPasswordAuthentication(){
			String userName = "anishpavuluri@yahoo.com";
			String password = "password";
			System.out.println("##################----------->"+new PasswordAuthentication(userName, password));
			return new PasswordAuthentication(userName, password);
			
		}
		
	}

}
