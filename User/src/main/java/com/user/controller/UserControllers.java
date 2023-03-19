package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.entity.User;
import com.user.service.UserService;

@Controller
public class UserControllers {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/view")
	public String registrationUser() {
		return "newRegis";
	}
	
	
	@RequestMapping("/save")
	public String SaveOneUsers(@ModelAttribute("user") User user,Model model) {
		userService.saveOneUser(user);
		model.addAttribute("msg","Your data has been saved...");
		return "newRegis";
		
	}

}
