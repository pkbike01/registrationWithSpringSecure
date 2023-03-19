package com.emailAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emailAPI.UserRepository.UserRepository;
import com.emailAPI.entities.User;


@Service
public class UserService_Impl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
		
	}


	@Override
	public List<User> allUser() {
		List<User> users = userRepo.findAll();
		return users;
	}


	@Override
	public User findUserByuserId(long userId) {
		Optional<User> user = userRepo.findById(userId);
		return user.get();
	}

}
