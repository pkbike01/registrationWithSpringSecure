package com.emailAPI.services;

import java.util.List;

import com.emailAPI.entities.User;

public interface UserService {
	
	
	
	public void saveUser(User user);

	public List<User> allUser();

	public User findUserByuserId(long userId);

}
