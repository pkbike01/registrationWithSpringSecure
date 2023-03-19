package com.emailAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailAPI.utility.EmailService;

@Controller
public class UserEmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub,@RequestParam("emailBody") String emailBody) {
		emailService.sendEmail(to,sub,emailBody);
		return "compose_email";
	}

}
