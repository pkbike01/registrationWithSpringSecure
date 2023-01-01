package com.blogapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {
	

	
	@RequestMapping
	public String dashboard() {
		return "user_dashboard";
	}

}
