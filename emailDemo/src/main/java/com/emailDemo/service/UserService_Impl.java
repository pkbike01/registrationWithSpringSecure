package com.emailDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emailDemo.entity.User;
import com.emailDemo.repository.UserRepository;

@Service
public class UserService_Impl implements UserService{
	
	
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveOneUser(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> allUser() {
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public User getOneUser(long id) {
		Optional<User> user = userRepo.findById(id);
		return user.get();
	}

}
