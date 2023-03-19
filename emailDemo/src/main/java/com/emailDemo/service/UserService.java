package com.emailDemo.service;

import java.util.List;

import com.emailDemo.entity.User;

public interface UserService {

	public void saveOneUser(User user);

	public List<User> allUser();

	public User getOneUser(long id);

}
