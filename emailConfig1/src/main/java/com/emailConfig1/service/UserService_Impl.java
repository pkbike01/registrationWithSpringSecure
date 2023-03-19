package com.emailConfig1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emailConfig1.entity.User;
import com.emailConfig1.repository.UserRepository;
@Service
public class UserService_Impl implements UserService {
	
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User saveUser(User user) {
		User users = userRepo.save(user);
		return users;
	}
	
	
	
	

}
