package com.registrationWithSpringSecur.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.registrationWithSpringSecur.entity.User;
import com.registrationWithSpringSecur.payLoad.UserDto;
import com.registrationWithSpringSecur.repository.UserRepository;

@Service
public class UserService_Impl implements UserService {
	
	
	
	private UserRepository userRepo;

	public UserService_Impl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	

	@Override
	public UserDto createOneUser(UserDto userDto) {
		User user = mapToEntity(userDto);
		User save = userRepo.save(user);
		return mapToDto(save);
	}
	
	private UserDto mapToDto(User user) {
		UserDto dto = new UserDto();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setRole(user.getRole());
		
		return dto;
	}
	
	private User mapToEntity(UserDto userDto) {
		User entity = new User();
		entity.setName(userDto.getName());
		entity.setEmail(userDto.getEmail());
		entity.setPassword(userDto.getPassword());
		entity.setRole(userDto.getRole());
		return entity;
	}



	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = userRepo.findAll();
		return users.stream().map( user -> mapToDto(user)).collect(Collectors.toList());
	}

}
