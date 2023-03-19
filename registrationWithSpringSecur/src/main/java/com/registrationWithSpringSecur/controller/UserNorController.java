package com.registrationWithSpringSecur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registrationWithSpringSecur.payLoad.UserDto;
import com.registrationWithSpringSecur.service.UserService;



@Controller
@RequestMapping("/user")
public class UserNorController {
	
	
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping
	public String registrationPage() {
		return "regis_page";

	}
	@RequestMapping("/register")
	public String saveUser(@ModelAttribute("userDto") UserDto userDto,Model model) {
		userDto.setRole("ROLE_NORMAL");
		userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
		userService.createOneUser(userDto);
		
		model.addAttribute("msg","registered successfully...");
		return "regis_page";
		
	}
	
	@RequestMapping("/signin")
	public String login() {
//		model.addAttribute(userName,userName);
		return "login";
	}
}
	
