package com.emailAPI.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailService_Impl implements EmailService{
	
	@Autowired
	private JavaMailSender sendEmail;

	@Override
	public void sendEmail(String to, String sub, String emailBody) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(sub);
		mail.setText(emailBody);
		sendEmail.send(mail);
	}
	
	
	
	
	
	
	

}
