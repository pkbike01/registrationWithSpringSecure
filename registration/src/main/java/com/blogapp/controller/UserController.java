package com.blogapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogapp.entity.User;
import com.blogapp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping
	public String registrationPage() {
		return "regis_page";
		
	}
	@RequestMapping("/register")
	public String saveUser( @ModelAttribute("user") User user,ModelMap model ) {
		user.setRole("ROLE_NORMAL");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		userService.saveOneUser(user);
		model.addAttribute("msg","registered successfully!");
		
		return "regis_page";
	}
	
	//custom login
	@RequestMapping("/signin")
	public String login() {
//		model.addAttribute(userName,userName);
		return "login_page";
	}
	
	@RequestMapping("/userInfo")
	public String login(@RequestParam("userName") String userName,@RequestParam ("password") String password,Model model) {
		model.addAttribute(userName,userName);
		System.out.println(userName);
		System.out.println(password);
		return "userInfo";
	}
	
	
	
	
	
	

}
