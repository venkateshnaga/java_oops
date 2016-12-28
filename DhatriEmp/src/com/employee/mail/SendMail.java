package com.employee.mail;

	import java.util.Date;
	import java.util.Properties;
	import com.employee.bean.EmployeeBean;
	import javax.mail.Authenticator;
	import javax.mail.Message;
	import javax.mail.MessagingException;
	import javax.mail.PasswordAuthentication;
	import javax.mail.Session;
	import javax.mail.Transport;
	import javax.mail.internet.AddressException;
	import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeMessage;

	public class SendMail 
	{
		private static String host="smtp.gmail.com";
		private static String port="25";
		private static final String userName="venkatesh.dhatriinfo@gmail.com";
		private static final String password="venkatesh123";
		public static void sendEmail(EmployeeBean employeeBean) throws AddressException,
	            MessagingException {
	 
	        // sets SMTP server properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.host", host);
	        properties.put("mail.smtp.port", port);
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.starttls.enable", "true");
	 
	        // creates a new session with an authenticator
	        Authenticator auth = new Authenticator() {
	            public PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(userName, password);
	            }
	        };
	 
	        Session session = Session.getInstance(properties, auth);
	 
	        // creates a new e-mail message
	        Message msg = new MimeMessage(session);
	        String message_send="Hai This Is Venkatesh"+"\n"+"Your Employee Id In My Database= "+employeeBean.getEmpid() +"\n"+"Advance Happy New Year My Dear Friend "+employeeBean.getEmpname()+ "\n"; 
	        		msg.setFrom(new InternetAddress(userName));
	        InternetAddress[] toAddresses = { new InternetAddress(employeeBean.getEmpemail()) };
	        msg.setRecipients(Message.RecipientType.TO, toAddresses);
	        msg.setSubject("Hai " +employeeBean.getEmpname());
	        msg.setSentDate(new Date());
	        msg.setText(message_send);
	 
	        // sends the e-mail
	        Transport.send(msg);
	 
	    }


	}
