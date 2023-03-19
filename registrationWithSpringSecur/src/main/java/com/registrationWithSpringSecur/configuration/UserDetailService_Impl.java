package com.registrationWithSpringSecur.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.registrationWithSpringSecur.entity.User;
import com.registrationWithSpringSecur.payLoad.UserDto;
import com.registrationWithSpringSecur.repository.UserRepository;

public class UserDetailService_Impl implements UserDetailsService {
	
	
	
	//how to fetching from database.
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.getUserByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("Couldn't found user!!");
		}
		
		CustomUserDetails customUserDetails = new CustomUserDetails(user);
		return customUserDetails;
	}

}
