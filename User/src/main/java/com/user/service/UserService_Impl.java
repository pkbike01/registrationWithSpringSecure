package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserService_Impl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public void saveOneUser(User user) {
		userRepo.save(user);
		
	}

	@Override
	public User getUser(long id) {
		Optional<User> user = userRepo.findById(id);
		return user.get();
	}
	

}
