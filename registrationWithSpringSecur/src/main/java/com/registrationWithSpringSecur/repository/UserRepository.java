package com.registrationWithSpringSecur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.registrationWithSpringSecur.entity.User;
import com.registrationWithSpringSecur.payLoad.UserDto;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u where u.email=:email")
	public User getUserByUserName(@RequestParam("email") String email);

}
