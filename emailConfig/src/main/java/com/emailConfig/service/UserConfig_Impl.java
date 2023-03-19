package com.emailConfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emailConfig.entities.User;
import com.emailConfig.repositories.UserRepository;

@Service
public class UserConfig_Impl implements UserConfig{
	
	@Autowired
	private UserRepository userRepo;
	
	
	
	@Override
	public void saveOneUser(User user) {

		userRepo.save(user);
		
	}
}
