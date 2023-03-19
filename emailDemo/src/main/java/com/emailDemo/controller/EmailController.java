package com.emailDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailDemo.entity.User;
import com.emailDemo.service.UserService;
import com.emailDemo.utility.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/view")
	public String view() {
		return "regis";
	}
	
	
	@RequestMapping("/save")
	public String saveOneUser(@ModelAttribute("user") User user,Model model) {
		userService.saveOneUser(user);
		model.addAttribute("msg","user has been saved...!");
		return "regis";
		
	}
	
	
	@RequestMapping("/listAll")
	public String allUsers(Model model) {
		List<User> users = userService.allUser();
		model.addAttribute("users",users);
		return "allUsers";
	}
	
	@RequestMapping("/findUserByid")
	public String findOneUser(@RequestParam("id") long id,Model model) {
		User user = userService.getOneUser(id);
		model.addAttribute("user",user);
		return "get_user";
		
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		System.out.println(email);
		return "compose_email";
		
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub,@RequestParam("emailBody") String emailBody,ModelMap model) {
		emailService.sendEmailToUser(to,sub,emailBody);
		model.addAttribute("msg","email has been sent");
		return "compose_email";
	}
	

}
