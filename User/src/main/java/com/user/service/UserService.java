package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	public List<User> getAllUsers();

	public void saveOneUser(User user);

	public User getUser(long id);
	
	

}
