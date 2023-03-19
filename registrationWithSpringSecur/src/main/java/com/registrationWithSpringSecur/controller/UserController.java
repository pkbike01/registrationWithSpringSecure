package com.registrationWithSpringSecur.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registrationWithSpringSecur.payLoad.UserDto;
import com.registrationWithSpringSecur.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//create new user
	@PostMapping
	public ResponseEntity<UserDto> createOneUser(@RequestBody UserDto userDto) {
		return new ResponseEntity<>(userService.createOneUser(userDto),HttpStatus.CREATED);	
	}
	
	
	@GetMapping
	public List<UserDto> getAllUsers(){
		
		return userService.getAllUsers();
		
		
	}
	
	

}
