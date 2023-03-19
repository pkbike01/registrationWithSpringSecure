package com.emailConfig.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailConfig.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
