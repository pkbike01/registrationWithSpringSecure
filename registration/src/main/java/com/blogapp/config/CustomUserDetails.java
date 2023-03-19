package com.blogapp.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.blogapp.entity.User;
/**
 * UserDetails is an interface*/
public class CustomUserDetails implements UserDetails{
	
	//perform Autowire
	private User user;
	
	public CustomUserDetails(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//this is my code
		//By the help of SimpleGrantedAuthority class we Grant the "Normal User"
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRole());
		//new SimpleGrantedAuthority(user.getRole(){this is the authority of the user.})
		
		List<SimpleGrantedAuthority> list = Arrays.asList(simpleGrantedAuthority);
		
		return list;
	}

	@Override
	public String getPassword() {
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}
	
	
	
	

}
