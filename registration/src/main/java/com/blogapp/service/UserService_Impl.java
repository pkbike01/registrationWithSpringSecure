package com.blogapp.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapp.entity.User;
import com.blogapp.repository.UserRepository;

@Service
public class UserService_Impl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void saveOneUser(User user) {
		userRepo.save(user);
		
	}

}
