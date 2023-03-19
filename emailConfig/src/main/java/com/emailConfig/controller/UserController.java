package com.emailConfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailConfig.entities.User;
import com.emailConfig.service.UserConfig;
import com.emailConfig.utility.UserEmailConfig;

@Controller
public class UserController {
	
	@Autowired
	private UserEmailConfig userEmailConfig;
	
	
	@Autowired
	private UserConfig userConfig;
	
	@RequestMapping("/view")
	public String createOneLead() {
		return "create_user";
	}
	
	
	@RequestMapping("/saveUser")
	public String saveOneLead(@ModelAttribute("user") User user, ModelMap model) {
		userConfig.saveOneUser(user);
		model.addAttribute("user",user);
		return "create_user";
		
	}
	
	
	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		System.out.println(email);
		return "email";
		
	}
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("sub") String sub, @RequestParam("emailBody") String emailBody) {
		userEmailConfig.sendEmail(to, sub, emailBody);
		return "email";
		
		
	}

}
