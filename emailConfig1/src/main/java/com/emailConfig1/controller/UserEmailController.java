package com.emailConfig1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailConfig1.utility.UserEmailConfig;

@Controller
public class UserEmailController {
	
	
	@Autowired
	private UserEmailConfig sendEmail;
	
	
	@RequestMapping("/composeEmail")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("emailBody") String emailBody) {
		sendEmail.sendEmail(to, sub, emailBody);
		return "composeEmail";
	}
	
	
	
	

}
