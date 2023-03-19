package com.emailConfig1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailConfig1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
