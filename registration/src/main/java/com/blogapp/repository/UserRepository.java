package com.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blogapp.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	@Query("select u from User u where u.email = :email")
	public User getUserByUserName(@Param("email") String email);

}
