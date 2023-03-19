package com.emailDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailDemo.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
