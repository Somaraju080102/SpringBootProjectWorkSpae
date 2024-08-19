package com.nani.login.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtility {
	
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public boolean sendEmail(String subject,String body,String to) {
		
		SimpleMailMessage msg=new SimpleMailMessage();
		
		try {
			msg.setSubject(subject);
			msg.setTo(to);
			msg.setText(body);
			javaMailSender.send(msg);
			
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
