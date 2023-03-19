package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public List<User> getAlluser() {
		List<User> allUsers = userService.getAllUsers();
		return allUsers;
	}
	@GetMapping("/{id}")
	public User getById(@PathVariable("id") long id) {
		User user = userService.getUser(id);
		return user;
	}
	
	
	
	

}
