package com.emailConfig1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailConfig1.entity.User;
import com.emailConfig1.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("/view")
	public String view() {
		return "home";
	}
	
	
	@RequestMapping("/save")
	public String saveOneUser(@ModelAttribute("user") User user,ModelMap model) {
		User users = userService.saveUser(user);
		model.addAttribute("msg","your data has been saved !");
		model.addAttribute("user",users);
		return "viewData";
	}
	@RequestMapping("/sendEmail")
	public String sendEamil(@RequestParam("email") String email,Model model) {
		model.addAttribute("email",email);
		System.out.println(email);
		return "composeEmail";
		
	}
	
	
	
	
	
	
	

}
