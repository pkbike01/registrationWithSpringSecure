package com.registrationWithSpringSecur.service;

import java.util.List;

import com.registrationWithSpringSecur.payLoad.UserDto;

public interface UserService {
	UserDto createOneUser(UserDto userDto);

	List<UserDto> getAllUsers();

}
