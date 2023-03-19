package com.blogapp.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.blogapp.entity.User;
import com.blogapp.repository.UserRepository;

//UserDetailsService is an interface and it has only one incomplete method. which is known as loadUserByUsername(String username)

public class UserDetailService_Impl implements UserDetailsService{
	
	
	
	//how to fetching from database
	@Autowired
	private UserRepository userRepo;
	
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.getUserByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("Couldn't found user !! ");
		}
		
		CustomUserDetails customUserDetails = new CustomUserDetails(user);
		return customUserDetails;
	}

}
