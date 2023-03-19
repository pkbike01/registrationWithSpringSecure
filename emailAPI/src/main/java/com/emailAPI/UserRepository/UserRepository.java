package com.emailAPI.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailAPI.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
