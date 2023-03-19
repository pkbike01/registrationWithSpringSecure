package com.emailAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailAPI.entities.User;
import com.emailAPI.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/view")
	public String newRegis() {
		return "view";
	}
	
	
	@RequestMapping("/saveUser")
	public String saveOneUser(@ModelAttribute("user") User user, Model model) {
		userService.saveUser(user);
		model.addAttribute("msg","your data has been saved.....");
		
		
		return "view";
	}
	
	@RequestMapping("/listAll")
	public String allUser(ModelMap model) {
		List<User> allUser = userService.allUser();
		model.addAttribute("users", allUser);
		return "listAllUsers";
	
		
	}
	@RequestMapping("/findUserByuserId")
	public String getOneUser(@RequestParam("userId") long userId,Model model) {
		
		User user = userService.findUserByuserId(userId);
		model.addAttribute("user",user);
		return "oneUser";
	}
	
	@RequestMapping("/composeEmail")
	public String sendEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email",email);
		System.out.println(email);
		return "compose_email";
	}
	
	
	

}
